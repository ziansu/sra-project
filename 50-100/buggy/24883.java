public void actionPerformed(java.awt.event.ActionEvent e) {
    int red = ((int) ((java.lang.Math.random()) * 255));
    int green = ((int) ((java.lang.Math.random()) * 255));
    int blue = ((int) ((java.lang.Math.random()) * 255));
    randHMC = new java.awt.Color(red, green, blue);
    square.repaint();
    gallow.repaint();
}