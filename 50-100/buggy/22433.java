@java.lang.Override
public void onEvent(edu.chl.mailbowser.event.IEvent evt) {
    switch (evt.getType()) {
        case FETCH_EMAIL :
            javafx.application.Platform.runLater(() -> fetchEmail(((edu.chl.mailbowser.email.models.IEmail) (evt.getValue()))));
        case FETCH_EMAILS :
            break;
        case SEARCH :
            javafx.application.Platform.runLater(() -> search(((java.lang.String) (evt.getValue()))));
            break;
    }
}