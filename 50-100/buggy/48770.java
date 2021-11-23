private void addProductionPhaseAbilities(java.lang.String phase, game.model.transport.Transport transport, game.model.direction.TileCompartmentLocation tileCompartmentLocation, java.util.Map<game.model.direction.TileCompartmentDirection, java.util.List<game.model.transport.Transport>> tileTransports, game.model.managers.TransportManager transportManager) {
    if (phase == "Production") {
        this.addResearchAbility(transport, tileCompartmentLocation, tileTransports.get(tileCompartmentLocation.getTileCompartmentDirection()));
        this.addTransportReproduceAbility(transport, tileCompartmentLocation, tileTransports);
    }
}