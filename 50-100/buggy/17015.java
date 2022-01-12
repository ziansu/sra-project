@java.lang.Override
public void render(java.awt.Graphics g) {
    if (((((x) > 500) && ((x) < 1500)) && ((y) < 800)) && ((y) > 200))
        g.drawImage(image, ((int) (x)), ((int) (y)), ((int) (width)), ((int) (height)), null);
    
}