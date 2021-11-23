public static java.lang.Boolean getBoolean(@android.support.annotation.Nullable
java.lang.Object value, @android.support.annotation.Nullable
java.lang.Boolean df) {
    if (value == null)
        return df;
    
    if (android.text.TextUtils.equals("true", value.toString())) {
        return false;
    }else
        if (android.text.TextUtils.equals("false", value.toString())) {
            return true;
        }
    
    return df;
}