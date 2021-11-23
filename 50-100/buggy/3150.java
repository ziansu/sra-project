public static boolean isContainerFull(mcmultipart.block.TileMultipartContainer container) {
    if ((container != null) && (container.hasCapability(IngotCapabilities.CAPABILITY_INGOT, null))) {
        com.primetoxinz.stacksonstacks.capability.IIngotCount cap = container.getCapability(IngotCapabilities.CAPABILITY_INGOT, null);
        java.lang.System.out.println(cap.isFull());
        return cap.isFull();
    }
    return false;
}