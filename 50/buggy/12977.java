@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    br.pro.hashi.ensino.desagil.sqlite.StudentDAO dao = new br.pro.hashi.ensino.desagil.sqlite.SQLiteStudentDAO(this);
    dao.delete(student);
    dao.close();
    refresh();
    return false;
}