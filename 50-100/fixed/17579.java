@org.junit.Test
public void test() throws com.mob41.kmbeta.exception.CouldNotLoadDatabaseException, com.mob41.kmbeta.exception.InvalidArrivalTargetException {
    final java.lang.String busno = "2A";
    final java.lang.String stopcode = "LO02T10000";
    final java.lang.String stopname = "LOK WAH BUS TERMINUS";
    final int bound = 1;
    com.mob41.kmbeta.api.ArrivalManager arr = new com.mob41.kmbeta.api.ArrivalManager(busno, stopcode, bound, com.mob41.kmbeta.api.ArrivalManager.ENGLISH_LANG, false);
    arr.fetchNewData();
    java.lang.System.out.println(((("Arrival status at " + stopname) + " is ") + (arr.getArrivalTimeRemaining_Formatted())));
    java.lang.System.out.println(("Stopname: " + stopname));
    java.lang.System.out.println(("Stopcode:" + stopcode));
}