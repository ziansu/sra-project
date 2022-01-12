private static boolean isHeaderLine(int lineIndex, java.util.List<org.talend.dataprep.api.dataset.ColumnMetadata> columns) {
    boolean headerLine = false;
    for (org.talend.dataprep.api.dataset.ColumnMetadata columnMetadata : columns) {
        if (lineIndex < (columnMetadata.getHeaderSize())) {
            headerLine = true;
        }
    }
    return headerLine;
}