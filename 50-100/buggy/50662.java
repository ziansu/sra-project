private int getCRAMRecordCount(final java.lang.String cramFileName) {
    final org.seqdoop.hadoop_bam.CRAMFileReader cramReader = new org.seqdoop.hadoop_bam.CRAMFileReader(new java.io.File(cramFileName), ((java.io.File) (null)), testReferenceSource);
    final java.util.Iterator<org.seqdoop.hadoop_bam.SAMRecord> it = cramReader.getIterator();
    int recCount = 0;
    while (it.hasNext()) {
        final org.seqdoop.hadoop_bam.SAMRecord rec = it.next();
        recCount++;
    } 
    cramReader.close();
    return recCount;
}