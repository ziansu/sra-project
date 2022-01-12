public static void rollbackAfterBan(space.pxls.user.User who, boolean isUndo) {
    java.util.List<space.pxls.server.Packet.ServerPlace.Pixel> pixels = space.pxls.App.database.getPreviousPixels(who, isUndo, 18000);
    for (space.pxls.server.Packet.ServerPlace.Pixel pixel : pixels) {
        space.pxls.App.putPixel(pixel.x, pixel.y, pixel.color, who, false, true, (isUndo ? "(undo rollback)" : ""));
    }
    space.pxls.App.server.broadcast(new space.pxls.server.Packet.ServerPlace(pixels));
}