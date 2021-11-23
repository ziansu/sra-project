public static org.dragonet.cloudland.server.item.ItemPrototype createItem(int id, int maxStack, boolean binaryMetaRequired) {
    if (org.dragonet.cloudland.server.item.ItemPrototype.locked)
        throw new java.lang.IllegalStateException("can not create item prototypes after server started, consider using a mod. ");
    
    return new org.dragonet.cloudland.server.item.ItemPrototype(id, false, null, maxStack, binaryMetaRequired);
}