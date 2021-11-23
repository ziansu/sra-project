@java.lang.Deprecated
@android.support.annotation.Nullable
public java.lang.String toLegacyString() {
    java.lang.String string = ((this) == (org.wikipedia.page.Namespace.MAIN)) ? null : this.name();
    if (string != null) {
        org.wikipedia.util.StringUtil.capitalizeFirstChar(string.toLowerCase());
    }
    return string;
}