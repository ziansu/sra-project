@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    byte[] byteArray = savedInstanceState.getByteArray(getString(R.string.item_image));
    if (byteArray != null) {
        itemPic = android.graphics.BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        imageTakenYet = true;
    }
}