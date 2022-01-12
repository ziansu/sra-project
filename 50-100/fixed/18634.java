private void initializePlayer(java.lang.String filename, int type) {
    java.util.Scanner s = null;
    try {
        s = new java.util.Scanner(new java.io.File(filename));
    } catch (java.io.IOException e) {
        java.lang.System.out.println((("could not read the file: " + filename) + " while trying to initialize player in view."));
    }
    int x = java.lang.Integer.parseInt(s.next());
    int y = java.lang.Integer.parseInt(s.next());
    player = new edu.gu.maze.view.PlayerView(x, y, type);
}