public java.util.ArrayList<application.models.playerAsset.Unit> getUnits() {
    java.util.ArrayList<application.models.playerAsset.Unit> newList = new java.util.ArrayList<>();
    newList.addAll(battleGroup);
    newList.addAll(reinforcements);
    return newList;
}