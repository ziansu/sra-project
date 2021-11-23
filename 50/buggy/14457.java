@java.lang.Override
protected org.apollo.game.message.impl.RegionUpdateMessage add(int offset) {
    return new org.apollo.game.message.impl.SendPublicTileItemMessage(entity.getItem(), offset, entity.getOwnerIndex());
}