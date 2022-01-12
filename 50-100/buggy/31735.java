@android.support.annotation.NonNull
public static java.lang.String parseParams(okhttp3.RequestBody body, okio.Buffer requestbuffer) throws java.io.UnsupportedEncodingException {
    if (!(body.contentType().toString().contains("multipart"))) {
        return java.net.URLDecoder.decode(requestbuffer.readUtf8(), "UTF-8");
    }
    return "null";
}