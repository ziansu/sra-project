public static void removeItem(com.avene.avene.livina.upnp.DeviceDisplay dd) {
    com.avene.avene.livina.content.ServersContent.ITEMS.remove(dd);
    com.avene.avene.livina.content.ServersContent.ITEM_MAP.remove(dd.getDeviceMacId());
}