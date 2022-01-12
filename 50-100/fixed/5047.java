public net.binaryaura.customize.client.gui.huditem.HudItem get(int id) {
    for (net.binaryaura.customize.client.gui.huditem.HudItem hudItem : all.toArray(new net.binaryaura.customize.client.gui.huditem.HudItem[all.size()])) {
        if ((hudItem.getId()) == id)
            return hudItem;
        
    }
    Customize.log.error((("ID " + id) + " doesn't relate to a HudItem. Skipping"));
    return null;
}