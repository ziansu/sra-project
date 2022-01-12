public int getMaxGroupCount() {
    int groupCount = 0;
    for (org.broad.igv.sam.AlignmentInterval interval : intervalCache.values()) {
        org.broad.igv.sam.PackedAlignments packedAlignments = interval.getPackedAlignments();
        if (packedAlignments != null) {
            groupCount = java.lang.Math.max(groupCount, packedAlignments.size());
        }
    }
    return groupCount;
}