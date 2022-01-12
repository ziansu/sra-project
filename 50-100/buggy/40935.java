public java.lang.String format(java.lang.Object value) {
    java.sql.Blob blob = ((java.sql.Blob) (value));
    try {
        byte[] bytes = blob.getBytes(0, ((int) (blob.length())));
        return super.format(bytes);
    } catch (java.lang.Exception e) {
    }
    return "*ERROR*";
}