@org.junit.Test
public void compareStartDate_SourceNull() {
    java.time.LocalDate targetEnd = java.time.LocalDate.of(2015, 10, 19);
    raijin.common.datatypes.DateTime source = new raijin.common.datatypes.DateTime(null, targetEnd);
    assertEquals((-1), source.compareStartDate(null, targetEnd));
}