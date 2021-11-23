public void filterByBED(buffer.BEDFile bedFile, buffer.variant.VariantPool pool) throws java.io.IOException {
    bedFile.buildIntervalsMap();
    for (java.lang.String contig : getContigs()) {
        java.util.List<buffer.variant.VariantRec> vars = getVariantsForContig(contig);
        for (buffer.variant.VariantRec rec : vars) {
            if (bedFile.contains(contig, rec.getStart(), false)) {
                pool.addRecordNoSort(rec);
            }
        }
    }
    pool.sortAllContigs();
}