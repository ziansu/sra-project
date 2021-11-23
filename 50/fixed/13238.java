public void exit() {
    active = false;
    Root.INSTANCE.renderSystem.removeObject(background, 3);
    Root.INSTANCE.renderSystem.removeObject(currentRenderObject, 4);
}