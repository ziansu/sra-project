private static boolean isHexString(@javax.annotation.Nullable
java.lang.String pass) {
    return (pass != null) && (pass.matches("[0-9a-fA-F]+"));
}