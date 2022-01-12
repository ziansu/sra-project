public static void mainBeginDraw() {
    if ((loon.LSystem._base) == null) {
        return ;
    }
    loon.Display game = loon.LSystem._base.display();
    if (game != null) {
        loon.opengl.GLEx gl = game.GL();
        if (!(gl.running())) {
            gl.saveTx();
            gl.begin();
        }
    }
}