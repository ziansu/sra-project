public void processExtras(final hu.rycus.rpiomxremote.RemoteService remoteService) {
    hu.rycus.rpiomxremote.manager.PlayerProperty.initialize(remoteService.getResources());
    if ((extras) != null) {
        for (final java.lang.String id : extras.keySet()) {
            final hu.rycus.rpiomxremote.manager.PlayerProperty property = hu.rycus.rpiomxremote.manager.PlayerProperty.get(id);
            if (property != null) {
                properties.put(property, extras.get(id));
            }
        }
    }
    loadPoster(remoteService);
}