@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    java.lang.String content = tvTeacherName.getText().toString();
    android.util.Log.d("String teacherName", content);
    if ((!(content.equals(currentTeacherFullName))) && (!(content.isEmpty()))) {
        setChanged(true);
    }else {
        setChanged(false);
    }
}