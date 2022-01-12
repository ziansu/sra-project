@java.lang.Override
public dan200.computercraft.api.peripheral.IPeripheral createPeripheral(com.austinv11.peripheralsplusplus.turtles.ITurtleAccess turtle, com.austinv11.peripheralsplusplus.turtles.TurtleSide side) {
    return new com.austinv11.peripheralsplusplus.tiles.TileEntitySpeaker(turtle, side);
}