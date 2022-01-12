public void keyPressed(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ESCAPE)) {
        MainGame.dHelper.dispose();
        MainGame.mode = MainGame.GAMEMODE.Game;
        dispose();
    }else
        if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_SHIFT)) {
            ca.eekedu.Project_Freedom.DrawingFrame.pressed = true;
            ca.eekedu.Project_Freedom.DrawingFrame.startX = ca.eekedu.Project_Freedom.DrawingFrame.mouseX;
            ca.eekedu.Project_Freedom.DrawingFrame.startY = ca.eekedu.Project_Freedom.DrawingFrame.mouseY;
            mousePos();
        }
    
}