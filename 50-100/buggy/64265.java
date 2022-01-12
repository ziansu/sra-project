public static java.util.EnumSet<com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol> protocolsFromBits(int bits) {
    java.util.EnumSet<com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol> perms = java.util.EnumSet.of(com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol.None);
    for (com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol p : com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol.values()) {
        if ((bits & (p.getFlagValue())) != 0) {
            perms.remove(com.microsoft.windowsazure.services.media.models.AssetDeliveryProtocol.None);
            perms.add(p);
        }
    }
    return perms;
}