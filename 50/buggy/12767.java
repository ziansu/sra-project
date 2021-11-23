@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    tmp_sql_str = commandlist.getText();
    java.lang.String dataname = GetSelectDB();
    java.lang.System.out.println(("选择数据" + dataname));
    Thread_exec();
}