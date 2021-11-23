@android.support.annotation.Nullable
public java.lang.String getHeader(@android.support.annotation.NonNull
java.lang.String key) {
    return ir.siper.core.SiperUtils.decode(message.getCustomHeader(key));
}