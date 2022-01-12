private void refresh() {
    br.pro.hashi.ensino.desagil.json.StudentDAO dao = new br.pro.hashi.ensino.desagil.json.JSONStudentDAO(this);
    java.util.List<br.pro.hashi.ensino.desagil.json.Student> students = dao.retrieve();
    dao.close();
    listAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, students);
    listView.setAdapter(listAdapter);
}