private java.awt.Font randomFont() {
    java.util.Random r = new java.util.Random();
    int index = r.nextInt(this.fontNames.length);
    java.lang.String fontName = this.fontNames[index];
    int style = r.nextInt(4);
    int size = (r.nextInt(this.fontSizeRange)) + (this.fontBasicSize);
    return new java.awt.Font(fontName, style, size);
}