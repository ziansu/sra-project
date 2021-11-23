public void keyPressed(java.awt.event.KeyEvent e) {
    java.lang.System.out.println(e.getKeyChar());
    player.keys[e.getKeyCode()] = true;
    synchronized(player.strokes) {
        player.strokes.add(e.getKeyCode());
    }
}