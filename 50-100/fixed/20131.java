@java.lang.Override
public void draw(java.awt.Graphics g) {
    drawBloodBar(g);
    if (((slowCount)++) == (slowMax)) {
        (imagesNowIndex)++;
        slowCount = 0;
    }
    if ((imagesNowIndex) >= (imagesMaxIndex)) {
        imagesNowIndex = 0;
    }
    g.drawImage(images.get(imagesNowIndex), x, y, null);
}