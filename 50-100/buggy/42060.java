private void addTradingPhaseAbilities(java.lang.String phase, game.model.transport.Transport transport, game.model.direction.TileCompartmentLocation tileCompartmentLocation, java.util.Map<game.model.direction.TileCompartmentDirection, java.util.List<game.model.transport.Transport>> tileTransports, game.model.managers.TransportManager transportManager) {
    if (phase == "Trading") {
        this.addPickUpResourceAbility(transport, tileCompartmentLocation);
        this.addDropResourceAbility(transport, tileCompartmentLocation);
        this.addPickUpTransportAbility(transport, tileCompartmentLocation, tileTransports.get(tileCompartmentLocation.getTileCompartmentDirection()));
        this.addDropTransportAbility(transport);
    }
}