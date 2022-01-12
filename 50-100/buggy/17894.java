@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    try {
        byte[] byteArray = savedInstanceState.getByteArray(getString(R.string.item_image));
        itemPic = android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        imageTakenYet = true;
    } catch (java.lang.Exception e) {
        android.util.Log.e(LOG_TAG, "Couldn't restore image from saved Bundle", e);
    }
}