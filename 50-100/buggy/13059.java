public void enterBuilding(java.lang.String bldName) {
    chronos.pdc.buildings.Building bldg = _bReg.getBuilding(bldName);
    if (bldg != null) {
        java.lang.String description = bldg.getInteriorDescription();
        java.lang.String imagePath = bldg.getIntImagePath();
        displayBuilding(description, imagePath);
        _currentBldg = bldg;
        _frame.setOnTown(false);
    }else {
        _frame.displayText(civ.BuildingDisplayCiv.NO_BLDG_FOUND);
    }
}