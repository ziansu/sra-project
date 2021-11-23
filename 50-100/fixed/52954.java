@org.junit.Test
public void canCallConstructorWithParams() {
    javax.swing.JLabel statusBar = new javax.swing.JLabel("test label");
    int width = 4;
    int height = 2;
    java.lang.String title = "title";
    com.jasonderek.tetris.Board board = new com.jasonderek.tetris.Board(statusBar);
    tetris = new com.jasonderek.tetris.Tetris(width, height, title, board);
}