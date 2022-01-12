public void changeState(com.spoiledmilk.ibikecph.map.IBCMapView.MapState newState) {
    state = newState;
    updateListeners();
}