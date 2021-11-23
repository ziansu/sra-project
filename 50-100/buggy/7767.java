@org.junit.Test
public void testKeyByColumnIterator() {
    int count = 0;
    java.util.Iterator<java.lang.Integer> iterator = occurrenceService.getKeysByColumn(org.apache.hadoop.hbase.util.Bytes.toBytes(org.gbif.occurrence.persistence.OccurrencePersistenceServiceImplTest.DATASET_KEY.toString()), org.gbif.occurrence.persistence.hbase.Columns.column(GbifTerm.datasetKey));
    while (iterator.hasNext()) {
        iterator.next();
        count++;
    } 
    org.junit.Assert.assertEquals(1, count);
}