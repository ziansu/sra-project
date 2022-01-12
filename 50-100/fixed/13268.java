@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.example.setditjenp2mkt.adapterdemo.AddStudentActivity.class);
    int student = java.lang.Integer.parseInt(searchList.get(position).getNo());
    com.example.setditjenp2mkt.adapterdemo.Student students = studentList.get((student - 1));
    intent.putExtra("edit", true);
    intent.putExtra("student_position", students);
    intent.putExtra("position", (student - 1));
    startActivity(intent);
}