@java.lang.Override
public void onClick(android.view.View v) {
    in.wptrafficanalyzer.parcelobjectdemo.Student student = new in.wptrafficanalyzer.parcelobjectdemo.Student(mEtSName.getText().toString(), java.lang.Integer.parseInt(mEtSAge.getText().toString()), mEtSAddress.getText().toString(), mEtSCourse.getText().toString());
    android.content.Intent intent = new android.content.Intent(getBaseContext(), in.wptrafficanalyzer.parcelobjectdemo.StudentViewActivity.class);
    intent.putExtra("student", student);
    startActivity(intent);
}