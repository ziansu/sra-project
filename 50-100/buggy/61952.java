@java.lang.Override
public void perform() {
    neildg.com.megatronsr.io.FileImageWriter imageWriter = neildg.com.megatronsr.io.FileImageWriter.getInstance();
    imageWriter.recreateDirectory();
    neildg.com.megatronsr.io.BitmapURIRepository bitmapURIRepository = neildg.com.megatronsr.io.BitmapURIRepository.getInstance();
    for (int i = 0; i < (numImagesSelected); i++) {
        android.graphics.Bitmap downsampledBitmap = bitmapURIRepository.getDownsampledBitmap(i, 1);
        imageWriter.saveBitmapImage(downsampledBitmap, ((neildg.com.megatronsr.constants.FilenameConstants.INPUT_PREFIX_STRING) + i), ImageFileAttribute.FileType.JPEG);
        downsampledBitmap.recycle();
    }
}