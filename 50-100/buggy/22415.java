public void unregister(net.binaryaura.customize.client.gui.huditem.HudItem hudItem) {
    if (hudItem != null) {
        if (all.contains(hudItem)) {
            remove(hudItem);
            Customize.log.info(("Unregistered HudItem " + hudItem));
        }else {
            Customize.log.warn((hudItem + " isn't in the registry. Skipping"));
        }
    }else {
        Customize.log.warn("Null HudItem. Skipping");
    }
}