public void approachBuilding(java.lang.String bldName) {
    chronos.pdc.buildings.Building bldg = _bReg.getBuilding(bldName);
    if (bldg != null) {
        _currentBldg = bldg;
        java.lang.String description = bldg.getExteriorDescription();
        java.lang.String imagePath = bldg.getExtImagePath();
        displayBuilding(description, imagePath);
    }else {
        _frame.displayText(civ.BuildingDisplayCiv.NO_BLDG_FOUND);
    }
}