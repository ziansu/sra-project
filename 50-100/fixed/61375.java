@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    double x = e.getX();
    double y = e.getY();
    c.setCenterX(x);
    c.setCenterY(y);
    c.setFill(getGrad());
}