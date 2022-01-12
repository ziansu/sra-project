@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    caption.setTranslateX(e.getSceneX());
    caption.setTranslateY(e.getSceneY());
    int pct = ((int) (data.getPieValue()));
    caption.setText((((data.getName()) + " ") + (java.lang.Integer.toString(pct))));
}