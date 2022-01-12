@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (mainForm.getFriendSidePanel().getSearchTextField().getText().equals("")) {
        java.awt.Toolkit.getDefaultToolkit().beep();
    }else {
        mainForm.getFriendSidePanel().getGlobalSearchButton().setBounds(20, 10, 180, 50);
        client.sendSearchCommand(mainForm.getFriendSidePanel().getSearchTextField().getText());
    }
}