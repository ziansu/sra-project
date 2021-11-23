public void UpdateSubProcess(int DyeingProcessID, java.lang.String Order) {
    if ((SubProcessText.getText().length()) > 0) {
        DataEntities.DyeingProcess ThisDyeingProcess = new DataEntities.DyeingProcess(DyeingProcessID, this.SubProcessText.getText(), Order);
        Handlers.DyeingProcessHandler ThisDyeingProcessHandler = new Handlers.DyeingProcessHandler();
        if ((ThisDyeingProcessHandler.UpdateDyeingProcess(ThisDyeingProcess)) != (-1))
            UpdateChemicals(ThisDyeingProcess.getId());
        
    }
}