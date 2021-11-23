@java.lang.Override
public void messageRecieved(messenger.event.MessageEvent evt) {
    messenger.Message msg = evt.getMessage();
    if (((msg.getFlag()) != (messenger.Message.FLAG_POST)) || ((this) == (tabbedPane.getTabComponentAt(tabbedPane.getSelectedIndex())))) {
        return ;
    }
    lastUser = chatRoom.getUserName(msg.getSender());
}