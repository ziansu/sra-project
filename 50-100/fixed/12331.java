@java.lang.Override
public void removeConfigurations(java.lang.String context) {
    java.util.Set<java.lang.String> itemNames = contextMap.get(context);
    if (itemNames != null) {
        for (java.lang.String itemName : itemNames) {
            java.util.Set<org.eclipse.smarthome.core.thing.link.ItemChannelLink> links = itemChannelLinkMap.remove(itemName);
            if (links != null) {
                for (org.eclipse.smarthome.core.thing.link.ItemChannelLink removedItemChannelLink : links) {
                    notifyListenersAboutRemovedElement(removedItemChannelLink);
                }
            }
        }
        contextMap.remove(context);
    }
}