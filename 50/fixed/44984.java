@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.ArrayList<com.example.picturemanager.MyImage>> loader, java.util.ArrayList<com.example.picturemanager.MyImage> data) {
    setAdapter(data);
}