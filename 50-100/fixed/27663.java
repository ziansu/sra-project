@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    java.lang.System.out.println("click MOUSE");
    mouseX = e.getX();
    mouseY = e.getY();
    hidePlaceholders();
    fr.lri.swingstates.canvas.Canvas canvas = experiment.getCanvas();
    canvas.removeMouseListener(clickListener);
    experiment.nextTrial();
}