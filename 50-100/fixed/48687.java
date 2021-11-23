public void fillImage(java.util.Scanner sc) {
    for (int x = 0; x < (editor.ImageEditor.height); x++) {
        for (int y = 0; y < (editor.ImageEditor.width); y++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            editor.Pixel newPixel = new editor.Pixel(a, b, c);
            editor.ImageEditor.image[x][y] = newPixel;
        }
    }
}