public static net.dandielo.core.items.serialize.ItemFlag init(net.dandielo.core.items.dItem stockItem, java.lang.Class<? extends net.dandielo.core.items.serialize.ItemFlag> clazz) {
    net.dandielo.core.items.serialize.Attribute attr = clazz.getAnnotation(net.dandielo.core.items.serialize.Attribute.class);
    try {
        net.dandielo.core.items.serialize.ItemFlag itemflag = clazz.getConstructor(net.dandielo.core.items.dItem.class, java.lang.String.class).newInstance(attr.key());
        itemflag.item = stockItem;
        return itemflag;
    } catch (java.lang.Exception e) {
    }
    return null;
}