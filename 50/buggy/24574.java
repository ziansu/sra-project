private void cleanUp() {
    java.lang.System.out.println("EXIT");
    org.lwjgl.opengl.Display.destroy();
    java.lang.System.exit(0);
}