public void grayscale() {
    for (int x = 0; x < (editor.ImageEditor.width); x++) {
        for (int y = 0; y < (editor.ImageEditor.height); y++) {
            editor.ImageEditor.image[x][y].grayscale();
        }
    }
}