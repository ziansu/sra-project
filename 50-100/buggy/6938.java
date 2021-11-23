@android.support.annotation.Nullable
public static java.io.File createImageFile(final long orderNumber) {
    final java.lang.String imageFileName = (((com.bionic.kvt.serviceapp.GlobalConstants.LMRA_PHOTO_FILE_NAME) + orderNumber) + "_") + (com.bionic.kvt.serviceapp.utils.Utils.imageTimeStamp.format(new java.util.Date()));
    try {
        return java.io.File.createTempFile(imageFileName, ".jpg", com.bionic.kvt.serviceapp.utils.Utils.getOrderDir(orderNumber));
    } catch (java.io.IOException e) {
        com.bionic.kvt.serviceapp.Session.addToSessionLog(("Error on creating LMRA file: " + (e.toString())));
        return null;
    }
}