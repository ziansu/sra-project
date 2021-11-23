@java.lang.Override
protected void onClicked() {
    super.onClicked();
    Game_Map_StationBtn.tempP1Station = getStation();
    if (!(highlighted)) {
        highlighted = true;
        if (!(Game_Map_Manager.routingModeWindow.isVisible()))
            showInfoBox();
        
        Game_Map_StationBtn.selectedStation = this;
    }else {
        highlighted = false;
        hideInfoBox();
    }
}