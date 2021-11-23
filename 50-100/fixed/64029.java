@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    if ((this.getImage()) != null)
        g.drawImage(this.getImage(), this.gap, 0, ((int) (this.nw)), this.height, null);
    
}