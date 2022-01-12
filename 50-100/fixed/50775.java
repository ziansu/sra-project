public java.util.ArrayList<application.models.playerAsset.Unit> decommission(java.lang.String ArmyID) {
    java.util.ArrayList<application.models.playerAsset.Unit> units = new java.util.ArrayList<>();
    for (application.models.playerAsset.Army army : armyList) {
        if ((army.getID()) == ArmyID) {
            units = army.getUnits();
            armyIDs.add(army.getID());
            armyList.remove(army);
        }
    }
    return units;
}