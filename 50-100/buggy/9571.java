@android.support.annotation.Nullable
public static java.util.HashMap<java.lang.String, java.lang.String> getAttributes(android.media.ExifInterface exif) {
    java.util.HashMap<java.lang.String, java.lang.String> exifAttributes = null;
    try {
        java.lang.reflect.Field f = android.media.ExifInterface.class.getDeclaredField("mAttributes");
        f.setAccessible(true);
        exifAttributes = ((java.util.HashMap<java.lang.String, java.lang.String>) (f.get(exif)));
    } catch (java.lang.Exception ex) {
    }
    return (exifAttributes.size()) > 0 ? exifAttributes : null;
}