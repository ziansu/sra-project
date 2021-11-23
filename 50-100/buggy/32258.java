private static void putHitUpdateBlock(org.apollo.game.sync.block.HitUpdateBlock block, org.apollo.net.codec.game.GamePacketBuilder builder) {
    builder.put(DataType.BYTE, block.getDamage());
    builder.put(DataType.BYTE, DataTransformation.ADD, block.getType());
    builder.put(DataType.BYTE, block.getCurrentHealth());
    builder.put(DataType.BYTE, DataTransformation.NEGATE, block.getMaximumHealth());
}