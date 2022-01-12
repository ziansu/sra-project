@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    java.lang.System.out.println(event);
    if (event.getCode().equals(javafx.scene.input.KeyCode.D)) {
        delete(selected);
    }
    if (event.getCode().equals(javafx.scene.input.KeyCode.R)) {
        Tools.selectToggle(Rectangle);
    }
    if (event.getCode().equals(javafx.scene.input.KeyCode.E)) {
        Tools.selectToggle(Ellipse);
    }
    if (event.getCode().equals(javafx.scene.input.KeyCode.L)) {
        Tools.selectToggle(Line);
    }
}