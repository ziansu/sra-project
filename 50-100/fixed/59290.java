@java.lang.Override
public void render(java.awt.Graphics g) {
    g.setFont(f);
    g.setColor(java.awt.Color.black);
    g.fillRect(this.dialogStartX, this.dialogStartY, this.dialogBoxLength, this.dialogBoxHeight);
    g.setColor(java.awt.Color.white);
    this.drawString(g, this.currMessage, ((this.dialogStartX) + (this.dialogBoxInnerMargin)), ((this.dialogStartY) + (this.dialogBoxInnerMargin)));
}