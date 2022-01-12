@java.lang.Override
public void onClick(in.wptrafficanalyzer.parcelobjectdemo.View v) {
    in.wptrafficanalyzer.parcelobjectdemo.Student student = new in.wptrafficanalyzer.parcelobjectdemo.Student(mEtSName.getText().toString(), java.lang.Integer.parseInt(mEtSAge.getText().toString()), mEtSAddress.getText().toString(), mEtSCourse.getText().toString());
    in.wptrafficanalyzer.parcelobjectdemo.Intent intent = new in.wptrafficanalyzer.parcelobjectdemo.Intent(getBaseContext(), in.wptrafficanalyzer.parcelobjectdemo.StudentViewActivity.class);
    intent.putExtra("student", student);
    startActivity(intent);
}