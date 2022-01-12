public java.lang.String getFilePath() {
    switch (m_option) {
        case PLAIN :
        case BATCH :
            return m_file.getPath();
        case INLINEBATCH :
        default :
            java.lang.String filePath = ((m_context) == null) ? "AdHoc DDL Input" : m_context.getFilePath();
            assert (m_option) == (org.voltdb.parser.SQLParser.FileOption.INLINEBATCH);
            java.lang.String filePath = ((m_context) == null) ? "no file" : m_context.getFilePath();
            return ((("(inline batch delimited by '" + (m_delimiter)) + "' in ") + filePath) + ")";
    }
}