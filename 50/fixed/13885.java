@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = this.getIntent();
    startActivityForResult(intent, 1);
}