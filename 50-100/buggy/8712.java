public void resize(int width, int height) {
    camera.viewportWidth = ((com.packtpub.libgdx.canyonbunny.util.Constants.VIEWPORT_HEIGHT) / height) * width;
    camera.update();
    cameraGUI.viewportWidth = com.packtpub.libgdx.canyonbunny.util.Constants.VIEWPORT_GUI_WIDTH;
    cameraGUI.viewportHeight = ((com.packtpub.libgdx.canyonbunny.util.Constants.VIEWPORT_GUI_HEIGHT) / ((float) (height))) * ((float) (width));
    cameraGUI.position.set(((cameraGUI.viewportWidth) / 2), ((cameraGUI.viewportHeight) / 2), 0);
    cameraGUI.update();
}