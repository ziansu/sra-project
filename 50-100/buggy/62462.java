protected void remove(com.builtbroken.creation.content.forge.SmeltStack stack) {
    java.lang.System.out.println(("Removing stack " + stack));
    if ((stack != null) && ((stack.stack) != null)) {
        this.smelting_items.remove(stack);
        if (isServer()) {
            Engine.instance.packetHandler.sendToAllAround(new com.builtbroken.mc.core.network.packet.PacketTile(this, 2, stack.stack), this);
        }
    }else
        if (com.builtbroken.mc.core.Engine.runningAsDev) {
            Creation.INSTANCE.logger().error("Something tried to remove an item with an empty stack", new java.lang.RuntimeException());
        }
    
}