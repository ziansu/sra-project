@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    if ((carParkImage) == null) {
        return ;
    }
    java.awt.Dimension currentSize = getSize();
    if (size.equals(currentSize)) {
        g.drawImage(carParkImage, 0, 0, null);
    }else {
        g.drawImage(carParkImage, 0, 0, currentSize.width, currentSize.height, null);
    }
}