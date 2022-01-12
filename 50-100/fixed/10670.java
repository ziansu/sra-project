public java.io.InputStream getBinaryStream(java.lang.String columnLabel) throws java.sql.SQLException {
    try {
        java.sql.Blob blob = getBlob(columnLabel);
        return blob != null ? blob.getBinaryStream() : null;
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException((("An error occurred during the retrieval of the binary stream at column '" + columnLabel) + "'"), e);
    }
}