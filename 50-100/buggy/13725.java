public org.spongepowered.api.block.tileentity.Sign getSign() {
    if ((sign) == null) {
        sign = ((org.spongepowered.api.block.tileentity.Sign) (block.getTileEntity().orElseThrow(() -> new java.lang.IllegalStateException(((("IC given block that is not a sign! (" + (block.getBlockPosition().toString())) + ") in world ") + (block.getExtent().getName()))))));
    }
    return sign;
}