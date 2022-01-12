public void ClickWatershed(android.view.View v) {
    if ((com.example.bruno.seg.GalleryActivity.lastBitmap) != null) {
        mMat = new org.opencv.core.Mat();
        mMatDst = new org.opencv.core.Mat();
        org.opencv.android.Utils.bitmapToMat(com.example.bruno.seg.GalleryActivity.lastBitmap, mMat);
        org.opencv.imgproc.Imgproc.cvtColor(mMat, mMat, Imgproc.COLOR_RGBA2GRAY);
        watershed(mMat.getNativeObjAddr(), mMatDst.getNativeObjAddr(), progressChanged, progressChangedBilateral);
        letsSeeMat(mMatDst);
        letsSeeBitmap(com.example.bruno.seg.GalleryActivity.lastBitmap);
        org.opencv.android.Utils.matToBitmap(mMatDst, com.example.bruno.seg.GalleryActivity.lastBitmap);
        imgPicture.setImageBitmap(com.example.bruno.seg.GalleryActivity.lastBitmap);
    }
}