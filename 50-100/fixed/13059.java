public void enterBuilding(java.lang.String bldName) {
    chronos.pdc.buildings.Building bldg = _bReg.getBuilding(bldName);
    if (bldg != null) {
        _currentBldg = bldg;
        java.lang.String description = bldg.getInteriorDescription();
        java.lang.String imagePath = bldg.getIntImagePath();
        displayBuilding(description, imagePath);
        _frame.setOnTown(false);
    }else {
        _frame.displayText(civ.BuildingDisplayCiv.NO_BLDG_FOUND);
    }
}