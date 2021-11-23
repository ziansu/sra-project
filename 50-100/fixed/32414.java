private java.util.List<com.vaguehope.morrigan.model.media.MediaTagClassification> local_getTagClassifications() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.util.List<com.vaguehope.morrigan.model.media.MediaTagClassification> ret;
    java.sql.Statement stat = com.vaguehope.morrigan.model.media.internal.db.MediaSqliteLayer.getDbCon().createStatement();
    try {
        java.sql.ResultSet rs = stat.executeQuery(com.vaguehope.morrigan.model.media.internal.db.MediaSqliteLayer.SQL_TBL_TAGCLS_Q_ALL);
        try {
            ret = local_getTagClassification_parseRecordSet(rs);
        } finally {
            rs.close();
        }
    } finally {
        stat.close();
    }
    return ret;
}