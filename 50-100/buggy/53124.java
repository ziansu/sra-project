@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if (((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) && (e.isControlDown())) {
        java.lang.System.out.println("get");
        tmp_sql_str = commandlist.getText();
        java.lang.System.out.println(tmp_sql_str);
        dbn = GetSelectDB();
        Thread_exec();
        commandlist.setText("");
    }else {
        tmp_sql_str = (tmp_sql_str) + (e.getKeyChar());
    }
}