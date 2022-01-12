@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object src = e.getSource();
    if (src.equals(help)) {
        showHelp();
    }else
        if (src.equals(restart)) {
            message.setText("restart\n restart");
        }else {
            sendInput();
        }
    
}