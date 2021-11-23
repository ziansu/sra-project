@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getButton()) == (javafx.scene.input.MouseButton.PRIMARY)) {
        createMonthView(start);
    }
}