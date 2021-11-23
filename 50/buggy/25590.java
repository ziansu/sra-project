@org.junit.Test
public void compareStartDate_TargetNull() {
    java.time.LocalDate sourceEnd = java.time.LocalDate.of(2015, 10, 19);
    raijin.common.datatypes.DateTime source = new raijin.common.datatypes.DateTime(sourceEnd, null);
    assertEquals(1, source.compareStartDate(sourceEnd, null));
}