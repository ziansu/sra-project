public static java.lang.String escape(java.lang.String str) {
    str = java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFD);
    str = str.replaceAll("[^\\x00-\\x7F]", "");
    return android.database.DatabaseUtils.sqlEscapeString(str);
}