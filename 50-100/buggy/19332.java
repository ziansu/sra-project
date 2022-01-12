@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!((e.getSource()) instanceof javax.swing.JButton)) {
        return ;
    }
    javax.swing.JButton source = ((javax.swing.JButton) (e.getSource()));
    if (source.equals(help)) {
        showHelp();
    }else
        if (source.equals(restart)) {
            message.setText("restart\n restart");
        }else {
            sendInput();
        }
    
}