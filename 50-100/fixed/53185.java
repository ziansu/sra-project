private void onSesionInicializada() {
    initialize_geo();
    historyManager = new com.marker.destino.history.HistoryManager(gestorSesion.getUsuarioLoggeado().getId());
    lugarManager = new com.marker.destino.lugar.LugarManager(gestorSesion.getUsuarioLoggeado().getId());
    menuFragment.initializeManagers(historyManager, lugarManager);
    menuFragment.initializeFacebookUserData(gestorSesion.getUsuarioLoggeado());
    updateTrackMenu(gestorSesion.getMarcadores());
}