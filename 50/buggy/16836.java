@java.lang.Override
public java.lang.String generatePageSQL(java.lang.String SQL, int start, int page) {
    return java.lang.String.format(SQL, ((start + page) - 1), start);
}