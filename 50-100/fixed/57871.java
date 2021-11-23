public void playCorrect(Circle circle) {
    circle.setColor(java.awt.Color.GREEN);
    sequence = new IntervalNotation(circle.getNote());
    pattern = sequence.getPatternForRootNote(tonic);
    repaint();
    ETApplet.player.play(pattern);
    circle.setColor(java.awt.Color.BLACK);
    repaint();
}