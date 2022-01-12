public boolean onScreen() {
    return ((((boundingBoxWorld.left) <= (Prototype.stage.width)) && ((boundingBoxWorld.top) <= (Prototype.stage.height))) && ((boundingBoxWorld.right) >= 0)) && ((boundingBoxWorld.bottom) >= 0);
}