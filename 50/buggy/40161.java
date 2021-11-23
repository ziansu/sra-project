@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if ((myBitmap) != null) {
        myBitmap.recycle();
        myBitmap = null;
    }
}