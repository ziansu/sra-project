public void DeleteDyeingChemical(DataEntities.DyeingChemical thisDyeingChemical) {
    boolean isSuccessful = false;
    Database.ColorTextControlSlipRepository repo = new Database.ColorTextControlSlipRepository();
    isSuccessful = repo.DeleteDyeingChemicalByDyeingChemicalID(thisDyeingChemical);
}