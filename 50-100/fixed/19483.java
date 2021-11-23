@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String text = editTextTitle.getText().toString();
    if (!(text.equals(""))) {
        dataSource.createIdea(editTextTitle.getText().toString(), new java.util.Date().getTime());
    }
    finish();
}