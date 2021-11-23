public void unregister(int id) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : new net.binaryaura.customize.client.gui.huditem.HudItem[all.size()]) {
        if (id == (hudItem.getId())) {
            remove(hudItem);
            Customize.log.info(("Unregistered HudItem " + hudItem));
            return ;
        }
    }
    Customize.log.error((("ID " + id) + " doesn't relate to a HudItem. Skipping"));
}