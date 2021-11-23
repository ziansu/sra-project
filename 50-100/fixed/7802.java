@java.lang.Override
public void handle(javafx.event.Event evt) {
    java.lang.String text = "";
    java.lang.String eventType = evt.getEventType().toString();
    switch (eventType) {
        case "MOUSE_CLICKED" :
            text = "Mouse Clicked";
            break;
        case "MOUSE_ENTERED" :
            text = "Mouse entered";
            break;
        case "MOUSE_EXITED" :
            text = "Mouse exited";
            break;
        default :
            break;
    }
    java.lang.System.out.println(text);
    rootPane.getRootFooterArea().getTextOutputLabel().setText(text);
}