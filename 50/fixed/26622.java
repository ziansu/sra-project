public void mousePressed(java.awt.event.MouseEvent e) {
    ca.eekedu.Project_Freedom.DrawingFrame.pressed = true;
    ca.eekedu.Project_Freedom.DrawingFrame.startX = ca.eekedu.Project_Freedom.DrawingFrame.mouseX;
    ca.eekedu.Project_Freedom.DrawingFrame.startY = ca.eekedu.Project_Freedom.DrawingFrame.mouseY;
    mousePos();
}