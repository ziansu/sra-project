public void drawStack(int x, int y, jsettlers.common.mapobject.IStackMapObject object, float color) {
    forceSetup();
    byte elements = object.getSize();
    if (elements > 0) {
        drawStackAtScreen(x, y, object.getMaterialType(), elements, color);
    }
}