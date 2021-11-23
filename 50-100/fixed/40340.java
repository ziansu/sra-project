public static void RenderWorld(engine.World world, org.newdawn.slick.Graphics g) {
    try {
        graphics.GraphicsController.HandleCamera(world, g);
        graphics.GraphicsController.HandleTileAnimations(world, g);
        graphics.GraphicsController.TileCollisionDebug(world, g);
        graphics.GraphicsController.HandleEntityAnimations(world, g);
        graphics.GraphicsController.EntityCollisionDebug(world, g);
        graphics.GUIController.DrawMenus(world, g);
        graphics.GraphicsController.DrawDialogText(world, g);
    } catch (exceptions.CameraNotFoundException e) {
        java.lang.System.err.println("Error! Camera entity does not exist!");
    }
}