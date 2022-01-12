@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    if ((e.getEventType()) == (javafx.scene.input.MouseEvent.MOUSE_ENTERED)) {
        addControls();
    }else
        if ((e.getEventType()) == (javafx.scene.input.MouseEvent.MOUSE_EXITED)) {
            removeControls();
        }
    
}