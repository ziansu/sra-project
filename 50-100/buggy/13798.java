@java.lang.Override
public void display(processing.core.PApplet parent) {
    parent.fill(255, 0, 0);
    parent.rect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 80);
    parent.fill(255);
}