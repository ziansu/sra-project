public void selectUnit(com.lqtz.globaldomination.gameplay.Unit unitToSelect) {
    selectedUnit = unitToSelect;
    if ((selectedUnit) instanceof com.lqtz.globaldomination.gameplay.Settler) {
        gw.togglePane(1);
        utils.game.gw.unitButtons[2].setEnabled(false);
        utils.game.gw.unitButtons[1].setEnabled(true);
    }else
        if ((selectedUnit) instanceof com.lqtz.globaldomination.gameplay.Soldier) {
            gw.togglePane(1);
            utils.game.gw.unitButtons[1].setEnabled(false);
            utils.game.gw.unitButtons[2].setEnabled(true);
        }else {
            gw.togglePane(0);
        }
    
}