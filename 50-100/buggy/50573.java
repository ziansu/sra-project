public void unregister(java.lang.String name) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : new net.binaryaura.customize.client.gui.huditem.HudItem[all.size()]) {
        if (name.equals(hudItem.getName())) {
            remove(hudItem);
            Customize.log.info(("Unregisterd HudItem " + hudItem));
            return ;
        }
    }
    Customize.log.warn((("HUDItem " + name) + " isn't in the registery. Skipping"));
}