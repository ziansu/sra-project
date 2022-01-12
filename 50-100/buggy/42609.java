@java.lang.Override
public void run() {
    sprinterTurtle.SprinterTurtle.frame = new javax.swing.JFrame(title);
    sprinterTurtle.SprinterTurtle.frame.setSize(((sprinterTurtle.SprinterTurtle.boardWidth) + 17), ((sprinterTurtle.SprinterTurtle.boardHeight) + 40));
    sprinterTurtle.SprinterTurtle.frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    sprinterTurtle.SprinterTurtle.frame.setLocationRelativeTo(null);
    sprinterTurtle.SprinterTurtle.frame.setVisible(true);
    sprinterTurtle.SprinterTurtle.frame.add(sprinterTurtle.SprinterTurtle.CANVAS);
}