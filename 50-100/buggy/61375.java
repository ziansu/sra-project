@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    double x = e.getX();
    double y = e.getY();
    c.setCenterX(x);
    c.setCenterY(y);
    if ((p1) != null) {
        p1.setEnd(x, y);
    }else {
    }
    if ((p2) != null) {
        p2.setStart(x, y);
    }else {
    }
    c.setFill(getGrad());
}