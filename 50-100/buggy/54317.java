public void moveUp(int id) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : all) {
        if (id == (hudItem.getId())) {
            moveUp(hudItem);
        }
    }
    Customize.log.warn((("ID " + id) + " doesn't relate to a hudItem. Skipping"));
}