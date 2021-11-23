public void validate() {
    super.validate();
    buffer = createBufferedImage();
    com.codename1.ui.Form current = getCurrentForm();
    if (current == null) {
        return ;
    }
}