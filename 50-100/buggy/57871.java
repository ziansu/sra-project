public void playCorrect(Circle circle) {
    circle.setColor(java.awt.Color.GREEN);
    repaint();
    sequence = new IntervalNotation(circle.getNote());
    pattern = sequence.getPatternForRootNote(tonic);
    ETApplet.player.play(pattern);
    circle.setColor(java.awt.Color.BLACK);
    repaint();
}