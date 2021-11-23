@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    songQueue.remove(queuelist.getSelectedIndex());
    refreshQueue();
}