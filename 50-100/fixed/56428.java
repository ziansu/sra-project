@java.lang.Override
public void fillRect(int x, int y, int width, int height, java.awt.Color color) {
    for (int i = x; i <= (x + width); i++)
        for (int j = y; j <= (y + height); j++)
            mImage.setRGB(i, j, color.toIntBits());
        
    
}