public void purchaseLevel() {
    if (this.shipCompElem.isEnabled()) {
        stellarclicker.util.EShipComponent shipEnum = stringToEnum(shipCompElem.getId());
        stellarclicker.ship.ShipComponent shipComp = MainApplication.app.myShip.getComponent(shipEnum);
        MainApplication.app.myShip.purchaseComponentLevel(shipEnum);
        int newLevel = MainApplication.app.myShip.getComponent(shipEnum).getLevel();
        java.lang.String levelCost = shipComp.getFormattedLevelCost();
        updateLevel(newLevel);
        updateCost(levelCost);
    }
}