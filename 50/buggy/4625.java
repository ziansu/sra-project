@org.junit.Test
public void testOpenFile() {
    org.tros.logo.DynamicLogoController controller = new org.tros.logo.DynamicLogoController();
    org.tros.torgo.ControllerBase base = ((org.tros.torgo.ControllerBase) (controller));
    java.io.File file = new java.io.File("Yes");
    base.openFile(file);
}