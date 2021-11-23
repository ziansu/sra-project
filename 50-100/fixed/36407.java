private boolean convertEntity(nl.rutgerkok.hammer.GameFactory gameFactory, nl.rutgerkok.hammer.tag.CompoundTag entity) {
    if (entity.containsKey(EntityTag.ITEM)) {
        return convertItem(gameFactory.createItemStack(entity.getCompound(EntityTag.ITEM)));
    }
    if (entity.containsKey(EntityTag.ITEMS)) {
        return convertItemList(gameFactory, entity.getList(EntityTag.ITEMS, TagType.COMPOUND));
    }
    return false;
}