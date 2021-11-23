public void playTonic() {
    circles.get(0).setColor(java.awt.Color.YELLOW);
    java.lang.System.out.println("Color = yellow");
    repaint();
    ETApplet.player.play(tonic);
    java.lang.System.out.println("Pattern played");
    circles.get(0).setColor(java.awt.Color.BLACK);
    repaint();
}