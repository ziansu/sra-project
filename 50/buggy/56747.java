@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    de.dfki.chatView.Conversation conver = conversations.get(current_position);
    conver.setPinned(true);
}