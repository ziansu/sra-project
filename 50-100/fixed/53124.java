@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if (((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) && (e.isControlDown())) {
        tmp_sql_str = commandlist.getText();
        dbn = GetSelectDB();
        Thread_exec();
        commandlist.setText("");
    }else {
        tmp_sql_str = (tmp_sql_str) + (e.getKeyChar());
    }
}