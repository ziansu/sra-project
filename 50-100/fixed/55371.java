private com.badlogic.gdx.scenes.scene2d.ui.Table makeSmallImageTable() {
    java.lang.System.out.println(battleManager.getOrderedUnits().size());
    orderedUnits = battleManager.getOrderedUnits();
    for (com.mygdx.model.unit.Unit unit : orderedUnits) {
        turnSmallImageMap.get(unit.getFacePath()).setWidth(80);
        turnSmallImageMap.get(unit.getFacePath()).setHeight(80);
        smallImageTable.add(turnSmallImageMap.get(unit.getFacePath())).padLeft(12).padBottom(0);
    }
    return smallImageTable;
}