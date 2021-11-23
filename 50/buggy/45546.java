public void setTarget(net.minecraft.util.BlockPos position) {
    moveTo(position.subtract(origin), Turn.LEFT, worldS);
}