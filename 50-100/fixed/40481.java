@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case 1 :
            ifNoImageDownloaded();
            android.content.Intent intent = new android.content.Intent(this, com.guminegor.example.downloadingpicture.Settings.class);
            startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}