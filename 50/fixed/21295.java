public void repair() {
    stellarclicker.util.EShipComponent shipEnum = stringToEnum(shipCompElem.getId());
    MainApplication.app.myShip.gainComponentRepair(shipEnum);
    disableLevelButton();
}