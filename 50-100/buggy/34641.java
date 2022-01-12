@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (team.prophet.a3104.prophet_list.MainActivity.ACTIVITY_NEW_TASK)) {
        tag = data.getStringExtra(newTask.TAG_RESULT);
        project = data.getStringExtra(newTask.PROJECT_RESULT);
        content = data.getStringExtra(newTask.CONTENT_RESULT);
    }else {
        android.widget.Toast.makeText(this, R.string.requestCode_err, Toast.LENGTH_SHORT).show();
    }
}