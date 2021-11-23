public java.lang.String getAuthorsAsString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    if (((mAuthors) == null) && (mAuthors.isEmpty())) {
        return "";
    }
    for (java.lang.String author : mAuthors) {
        builder.append(author);
        builder.append(", ");
    }
    builder.delete(((builder.length()) - 2), ((builder.length()) - 1));
    return builder.toString();
}