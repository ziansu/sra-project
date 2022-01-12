@android.support.annotation.Nullable
public static java.lang.String loadJSONFromAsset(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.String fileName) {
    java.lang.String json = null;
    try {
        java.io.InputStream is = context.getAssets().open(fileName);
        int size = is.available();
        byte[] buffer = new byte[size];
        is.read(buffer);
        is.close();
        json = new java.lang.String(buffer, "UTF-8");
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
        return null;
    }
    return json;
}