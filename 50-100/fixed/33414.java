@java.lang.SuppressWarnings(value = { "OverloadedVarargsMethod" , "AccessingNonPublicFieldOfAnotherObject" })
@javax.annotation.Nonnull
public static <T> java.lang.String toString(@javax.annotation.Nonnull
java.lang.Class<? extends T> objectClass, @javax.annotation.Nullable
T object, @javax.annotation.Nonnull
com.codeforces.commons.text.StringUtil.ToStringOptions options, java.lang.String... fieldNames) {
    if (object == null) {
        return (com.codeforces.commons.text.StringUtil.getSimpleName(objectClass, options.addEnclosingClassNames)) + " {null}";
    }
    return com.codeforces.commons.text.StringUtil.toString(object, options, fieldNames);
}