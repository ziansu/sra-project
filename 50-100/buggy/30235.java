public void loadImage(java.awt.Component comp) {
    java.io.File fin = new megamek.common.util.MegaMekFile(dir, imageFile).getFile();
    if (!(fin.exists())) {
        java.lang.System.out.println((("Warning: MechTileSet is trying to " + "load a file that doesn't exist: ") + (fin.getPath())));
    }
    image = megamek.common.util.ImageUtil.loadImageFromFile(fin.toString());
    if ((image) == null) {
        java.lang.System.out.println((("Received null image from " + "ImageUtil.loadImageFromFile!  File: ") + (fin.toString())));
    }
}