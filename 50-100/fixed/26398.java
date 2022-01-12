@java.lang.Override
public void run() {
    java.lang.String tag = editText.getText().toString().trim();
    if ((tag != null) && ((tag.length()) >= 3)) {
        com.farmers.farmersflickr.FlickrManager.searchImagesByTag(uihandler, getApplicationContext(), tag);
    }
}