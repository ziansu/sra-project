public boolean loadAvatar() {
    gui.Textbox.AVATAR_IMAGE = GUIController.AVATAR_IMAGENAME;
    java.io.InputStream stream;
    try {
        stream = new java.io.FileInputStream(new java.io.File(gui.Textbox.AVATAR_IMAGE));
        javafx.scene.image.Image image = new javafx.scene.image.Image(stream, gui.Textbox.WIDTH, gui.Textbox.WIDTH, true, true);
        if (image != null) {
            avatar = image;
            avatarView.setImage(avatar);
        }
        return true;
    } catch (java.io.FileNotFoundException e) {
    }
    return false;
}