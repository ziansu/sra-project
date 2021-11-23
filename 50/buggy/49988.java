public int UpdateDyeingProcess(DataEntities.DyeingProcess dyeingProcess) {
    int ID = -1;
    Database.ColorTextControlSlipRepository repo = new Database.ColorTextControlSlipRepository();
    if (repo.CheckIfDyeingProcessNameExistsOnOtherDyeingProcessID(dyeingProcess)) {
        ID = repo.UpdateDyeingProcessByDyeingProcessID(dyeingProcess);
    }
    return ID;
}