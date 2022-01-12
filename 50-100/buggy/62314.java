public void printRegistry(net.minecraft.world.World worldObj) {
    java.lang.System.out.println((("Cameras registry for dimension " + (worldObj.provider.dimensionId)) + ":"));
    removeDeadCams(worldObj);
    for (cr0s.WarpDrive.CamRegistryItem cam : registry) {
        java.lang.System.out.println((((((((("- " + (cam.frequency)) + " (") + (cam.position.x)) + ", ") + (cam.position.y)) + ", ") + (cam.position.z)) + ")"));
    }
}