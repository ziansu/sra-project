public net.binaryaura.customize.client.gui.huditem.HudItem get(java.lang.String name) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : all.toArray(new net.binaryaura.customize.client.gui.huditem.HudItem[all.size()])) {
        if (name.equals(hudItem.getName()))
            return hudItem;
        
    }
    Customize.log.error((("HUDItem " + name) + " isn't in the registry. Skipping"));
    return null;
}