private void onSesionInicializada() {
    historyManager = new com.marker.destino.history.HistoryManager(gestorSesion.getUsuarioLoggeado().getId());
    lugarManager = new com.marker.destino.lugar.LugarManager(gestorSesion.getUsuarioLoggeado().getId());
    menuFragment.initializeManagers(historyManager, lugarManager);
    menuFragment.initializeFacebookUserData(gestorSesion.getUsuarioLoggeado());
    initialize_geo();
    updateTrackMenu(gestorSesion.getMarcadores());
}