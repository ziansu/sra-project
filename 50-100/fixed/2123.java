@java.lang.Override
public int getFontStringWidth(java.lang.String s) {
    int w = 0;
    int length = s.length();
    for (int i = 0; i < length; i++) {
        int c = com.mojang.mojam.gui.VFont.letters.indexOf(s.charAt(i));
        if (c < 0)
            continue;
        
        com.mojang.mojam.screen.Bitmap image = bitmapData[(c % 30)][(c / 30)];
        w += (image.w) + (com.mojang.mojam.gui.VFont.SPACE);
    }
    return w;
}