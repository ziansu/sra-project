@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if ((conversations) != null) {
        de.dfki.chatView.Conversation conver = conversations.get(current_position);
        conver.setPinned(true);
    }
}