@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    java.lang.System.out.println(("Video event " + e));
    if ((e.getEventType()) == (javafx.scene.input.MouseEvent.MOUSE_ENTERED)) {
        addControls();
    }else
        if ((e.getEventType()) == (javafx.scene.input.MouseEvent.MOUSE_EXITED)) {
            removeControls();
        }
    
}