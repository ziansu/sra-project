private ai.subut.kurjun.metadata.common.DefaultMetadata makeMetadata(java.sql.ResultSet current) throws java.sql.SQLException, org.apache.commons.codec.DecoderException {
    java.lang.String md5hex = current.getString(SqlStatements.CHECKSUM_COLUMN);
    byte[] md5 = org.apache.commons.codec.binary.Hex.decodeHex(md5hex.toCharArray());
    ai.subut.kurjun.metadata.common.DefaultMetadata meta = new ai.subut.kurjun.metadata.common.DefaultMetadata();
    meta.setMd5sum(new java.lang.String(md5));
    meta.setName(current.getString(SqlStatements.NAME_COLUMN));
    meta.setVersion(current.getString(SqlStatements.VERSION_COLUMN));
    meta.setSerialized(current.getString(SqlStatements.DATA_COLUMN));
    return meta;
}