@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    try {
        if (requestCode == (com.example.admin.friend.HomePagefragment.RESULT_OK)) {
            java.lang.String path = getPathFromCameraData(data, getActivity());
            android.graphics.Bitmap bmp = android.graphics.BitmapFactory.decodeFile(path);
            iv.setImageBitmap(bmp);
            storeImage(bmp);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}