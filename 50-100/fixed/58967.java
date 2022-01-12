public void moveUp(java.lang.String name) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : all) {
        if (name.equals(hudItem.getName())) {
            moveUp(hudItem);
        }
    }
    Customize.log.error((("HUDItem " + name) + " isn't in the registry. Skipping"));
}