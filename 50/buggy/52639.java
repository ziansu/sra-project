@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    dismissDialog();
    android.net.Uri uri = com.scanlibrary.Utils.getUri(getActivity(), bitmap);
    bitmap.recycle();
    scanner.onScanFinish(uri);
}