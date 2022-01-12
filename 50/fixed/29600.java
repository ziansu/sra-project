public void draw(java.awt.Graphics g, java.awt.image.ImageObserver obs) {
    if (show) {
        g.drawImage(this.img, x, y, obs);
    }else
        if ((show) == false) {
            img = null;
        }
    
}