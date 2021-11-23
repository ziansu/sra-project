@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, final android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent();
    if (position == 3)
        confirmRemove();
    else {
        setResult(position, intent);
        finish();
    }
}