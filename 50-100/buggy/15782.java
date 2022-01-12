public buffer.variant.VariantPool filterByBED(buffer.BEDFile bedFile) throws java.io.IOException {
    bedFile.buildIntervalsMap();
    buffer.variant.VariantPool pool = new buffer.variant.VariantPool();
    for (java.lang.String contig : getContigs()) {
        java.util.List<buffer.variant.VariantRec> vars = getVariantsForContig(contig);
        for (buffer.variant.VariantRec rec : vars) {
            if (bedFile.contains(contig, rec.getStart(), false)) {
                pool.addRecordNoSort(rec);
            }
        }
    }
    pool.sortAllContigs();
    return pool;
}