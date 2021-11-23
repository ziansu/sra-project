public void handleStopButton(com.fravokados.mindim.inventory.ContainerEntityPortalController containerEntityPortalController) {
    switch (state) {
        case OUTGOING_PORTAL :
        case INCOMING_PORTAL :
            closePortal(true);
            break;
        case CONNECTING :
            state = com.fravokados.mindim.block.tile.TileEntityPortalControllerEntity.State.READY;
            break;
    }
}