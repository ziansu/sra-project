public java.lang.String getGenealogyString() {
    java.lang.String ret = "";
    for (final int dt : genealogy) {
        if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.UPPER)) {
            ret = ret + "T";
        }
        if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.LOWER)) {
            ret = ret + "B";
        }
        if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.UNKNOWN)) {
            ret = ret + "U";
        }
    }
    return ret;
}