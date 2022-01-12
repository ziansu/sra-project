@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent me) {
    Manager.mouseDown = true;
    m.changeSelectedColor(cp.getClickedButton(me));
    cp.updateSelectedPosition();
    marusenkoSphereGUI.KeyboardMouseManager.lastX = me.getXOnScreen();
    marusenkoSphereGUI.KeyboardMouseManager.lastY = me.getYOnScreen();
    ((javax.swing.JButton) (me.getSource())).setBorder(javax.swing.BorderFactory.createLineBorder(borderColor, 3));
}