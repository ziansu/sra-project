public void register(net.binaryaura.customize.client.gui.huditem.HudItem hudItem) {
    if (hudItem != null) {
        add(hudItem);
        hudItem.setId(((nextId)++));
        Customize.log.info(("Registered " + hudItem));
    }else {
        Customize.log.error("Null HudItem. Skipping");
    }
}