@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    caption.setTranslateX(((e.getSceneX()) - 600));
    caption.setTranslateY(((e.getSceneY()) - 400));
    int pct = ((int) (data.getPieValue()));
    caption.setText((((data.getName()) + " ") + (java.lang.Integer.toString(pct))));
}