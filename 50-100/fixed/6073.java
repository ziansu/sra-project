public void grayscale() {
    for (int x = 0; x < (editor.ImageEditor.height); x++) {
        for (int y = 0; y < (editor.ImageEditor.width); y++) {
            editor.ImageEditor.image[x][y].grayscale();
        }
    }
}