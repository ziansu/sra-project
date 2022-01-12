private java.lang.Object findClickedObjectsInRoom(dungeon.JDPoint inGameLocation, java.util.List<graphics.GraphicObject> roomObjects, int roomOffsetX, int roomOffsetY) {
    java.util.Collections.sort(roomObjects, new de.jdungeon.androidapp.screen.GameScreen.GraphicObjectComparator());
    java.lang.Object clickedObject = null;
    for (graphics.GraphicObject graphicObject : roomObjects) {
        if (graphicObject.hasPoint(inGameLocation, roomOffsetX, roomOffsetY)) {
            clickedObject = graphicObject.getClickableObject();
            break;
        }
    }
    return clickedObject;
}