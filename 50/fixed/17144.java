@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    getClient().close();
    int count = tabbedChat.getTabCount();
    for (int i = 0; i < count; i++) {
        tabbedChat.remove(0);
    }
}