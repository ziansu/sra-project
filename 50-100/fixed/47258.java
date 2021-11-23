@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    com.piuucseditor.MainActivity.fileName = editView.getText().toString();
    if ((mainActivity.getSupportActionBar()) != null) {
        android.widget.TextView textView = ((android.widget.TextView) (mainActivity.findViewById(R.id.actionBarFileTextView)));
        textView.setText(com.piuucseditor.MainActivity.fileName);
    }
    Chart.isChanged = false;
}