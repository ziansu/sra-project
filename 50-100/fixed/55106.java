private void randomiseMissingSquare() {
    missingSquare = new java.awt.Rectangle(((int) ((java.lang.Math.random()) * (n))), ((int) ((java.lang.Math.random()) * (n))), 1, 1);
    repaint();
}