@java.lang.Override
protected void onClicked() {
    super.onClicked();
    Game_Map_StationBtn.selectedStation = this;
    if (!(highlighted)) {
        highlighted = true;
        if (!(Game_Map_Manager.routingModeWindow.isVisible()))
            showInfoBox();
        
    }else {
        highlighted = false;
        hideInfoBox();
    }
}