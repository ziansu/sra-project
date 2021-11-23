@java.lang.Override
protected net.minecraft.block.state.BlockState createBlockState() {
    java.lang.System.out.println("Creating blockstate");
    return new net.minecraft.block.state.BlockState(this, com.mattpenguin.magicasolaris.block.BlockSolarCollector.PROPERTY_DIRECTION);
}