@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    super.onOptionsItemSelected(item);
    switch (item.getItemId()) {
        case R.id.viewscreen_delete :
            ShowDeleteDialog();
            break;
        case R.id.viewscreen_share :
            ShareData(content_string);
            break;
        case R.id.viewscreen_notify :
            BuildNotification(title_string, content_string);
            break;
        case R.id.viewscreen_clipboard :
            CopyToClipboard(content_string);
            android.widget.Toast.makeText(getApplicationContext(), R.string.clipboard, Toast.LENGTH_SHORT).show();
            break;
    }
    return true;
}