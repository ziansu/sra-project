public void handle(javafx.scene.input.MouseEvent me) {
    java.lang.System.out.println((((me.getSceneX()) + ", ") + ((me.getSceneY()) - 55)));
    int x = ((int) (me.getSceneX())) / (main.gui.BoardPane.SPRITE_SIZE);
    int y = ((int) ((me.getSceneY()) - 55)) / (main.gui.BoardPane.SPRITE_SIZE);
    if (!(animating)) {
        clicked(x, y, image);
    }
}