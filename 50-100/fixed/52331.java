@java.lang.Override
public void onResume() {
    super.onResume();
    if (b) {
        try {
            if ((this.mImageFile) != null) {
                MainActivity.mBitmap = android.graphics.BitmapFactory.decodeFile(this.mImageFile.getAbsolutePath());
                team6.photoball.ProcessTask.initRotateImageIfRequired();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    b = false;
}