public java.lang.String getGenealogyString() {
    java.lang.String ret = "";
    for (final int dt : genealogy) {
        if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.UPPER)) {
            ret = ret + "T";
        }else
            if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.LOWER)) {
                ret = ret + "B";
            }else
                if (dt == (com.jug.export.CellStatsExporter.SegmentRecord.UNKNOWN)) {
                    ret = ret + "U";
                }else {
                    ret = ret + dt;
                }
            
        
    }
    return ret;
}