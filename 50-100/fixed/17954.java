public void buildLocalUnitSheet() {
    domain.Unit localUnit;
    if ((currentChar) instanceof domain.ChildCharacter) {
        localUnit = new domain.Unit(((domain.ChildCharacter) (currentChar)), currentJob, currentRoute, fixedParentInputStats, fixedParent, variedParentInputStats, variedParent, startLevel);
    }else {
        localUnit = new domain.Unit(currentChar, currentJob, currentRoute);
    }
    localUnitSheet.clear();
    buildSheet(localUnit, classHistory, localUnitSheet, 0);
}