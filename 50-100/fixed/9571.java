@android.support.annotation.Nullable
public static java.util.HashMap<java.lang.String, java.lang.String> getAttributes(android.media.ExifInterface exif) {
    try {
        java.lang.reflect.Field f = android.media.ExifInterface.class.getDeclaredField("mAttributes");
        f.setAccessible(true);
        java.util.HashMap<java.lang.String, java.lang.String> exifAttributes = ((java.util.HashMap<java.lang.String, java.lang.String>) (f.get(exif)));
        if ((exifAttributes != null) && ((exifAttributes.size()) > 0))
            return exifAttributes;
        
    } catch (java.lang.Exception ex) {
    }
    return null;
}