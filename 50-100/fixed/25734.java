private void consumeInfectAction(io.infectnet.server.engine.core.entity.wrapper.Action action) {
    io.infectnet.server.engine.content.system.infect.InfectAction infectAction = ((io.infectnet.server.engine.content.system.infect.InfectAction) (action));
    if (world.neighboursOf(infectAction.getSource()).contains(infectAction.getResource())) {
        requestQueue.add(new io.infectnet.server.engine.content.system.inventory.InventoryModificationRequest(infectAction.getSource(), action, io.infectnet.server.engine.content.system.infect.InfectSystem.ITEM_NAME, io.infectnet.server.engine.content.system.infect.InfectSystem.MODIFICATION_NUMBER));
        requestQueue.add(new io.infectnet.server.engine.content.system.inventory.InventoryModificationRequest(infectAction.getResource(), action, io.infectnet.server.engine.content.system.infect.InfectSystem.ITEM_NAME, ((-1) * (io.infectnet.server.engine.content.system.infect.InfectSystem.MODIFICATION_NUMBER))));
    }
}