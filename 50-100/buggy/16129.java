@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    paint.setColor(paint.RED);
    java.lang.System.out.println(("set color: " + (paint.getColor())));
    if ((selectedShape) != null) {
        if ((paint.getShapeType()) == (paint.SELECT)) {
            selectedShape.setColor(java.awt.Color.RED);
            paint.repaint();
        }
    }
}