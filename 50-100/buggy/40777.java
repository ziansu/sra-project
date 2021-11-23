public void UpdateSubProcess(int DyeingProcessID, java.lang.String Order) {
    if ((SubProcessText.getText().length()) > 0) {
        DataEntities.DyeingProcess ThisDyeingProcess = new DataEntities.DyeingProcess();
        Handlers.DyeingProcessHandler ThisDyeingProcessHandler = new Handlers.DyeingProcessHandler();
        ThisDyeingProcess.setId(DyeingProcessID);
        ThisDyeingProcess.setDyeingProcessName(this.SubProcessText.getText());
        ThisDyeingProcess.setDyeingProcessOrder(Order);
        ThisDyeingProcessHandler.UpdateDyeingProcess(ThisDyeingProcess);
        UpdateChemicals(ThisDyeingProcess.getId());
    }
}