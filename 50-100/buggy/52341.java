public void setBottomPortal() {
    if (portals.contains(bottomPortal, true)) {
        portals.removeValue(bottomPortal, true);
    }
    bottomPortal = new com.mygdx.game.Portal(this, PortalPos.DOWN, (((Constants.GAMESCREEN_WIDTH) / 2) - ((Constants.PORTAL_WIDTH) / 2)), (-(Constants.PORTAL_HEIGHT)), Constants.PORTAL_WIDTH, Constants.PORTAL_HEIGHT);
    portals.add(bottomPortal);
}