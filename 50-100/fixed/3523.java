public void print() {
    for (int x = 0; x < (editor.ImageEditor.height); x++) {
        for (int y = 0; y < (editor.ImageEditor.width); y++) {
            java.lang.System.out.println(editor.ImageEditor.image[x][y].print());
        }
    }
}