@android.support.annotation.NonNull
public com.tonyodev.fetch.request.Request addHeader(@android.support.annotation.NonNull
java.lang.String header, @android.support.annotation.Nullable
java.lang.String value) {
    return addHeader(new com.tonyodev.fetch.request.Header(header, value));
}