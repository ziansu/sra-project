public void menuUpdate() {
    DrawQuadTex(background, 0, 0, 512, 512);
    menuUI.draw();
    org.lwjgl.opengl.Display.update();
    org.lwjgl.opengl.Display.sync(60);
}