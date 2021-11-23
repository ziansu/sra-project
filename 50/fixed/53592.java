@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    new com.ihasama.ohtu.ui.ReferenceDialog("New Reference", dao).showDialog();
    list.refresh();
    refresh();
}