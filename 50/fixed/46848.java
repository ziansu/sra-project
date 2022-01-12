@java.lang.Override
public java.lang.String getCursorName() {
    if ((statement) != null) {
        return statement.getCursorName();
    }
    return "NO_NAME";
}