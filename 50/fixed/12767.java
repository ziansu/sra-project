@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    tmp_sql_str = commandlist.getText();
    java.lang.String dataname = GetSelectDB();
    Thread_exec();
}