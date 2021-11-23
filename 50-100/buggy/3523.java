public void print() {
    for (int x = 0; x < (editor.ImageEditor.width); x++) {
        for (int y = 0; y < (editor.ImageEditor.height); y++) {
            java.lang.System.out.println(editor.ImageEditor.image[x][y].print());
        }
    }
}