@android.support.annotation.NonNull
public static android.graphics.drawable.Drawable decodeFileOrThrow(@android.support.annotation.Nullable
final android.content.res.Resources res, final java.lang.String filePath, @android.support.annotation.Nullable
final android.graphics.BitmapFactory.Options options) throws java.io.IOException {
    if (filePath == null) {
        throw new java.lang.NullPointerException("filePath must not be null");
    }
    if ((filePath.length()) == 0) {
        throw new java.lang.IllegalArgumentException("filePath must not be empty");
    }
    return com.doctoror.imagefactory.ImageFactory.decodeStreamOrThrow(res, new java.io.FileInputStream(filePath), null, options);
}