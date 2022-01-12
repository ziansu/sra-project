private java.lang.String timeCell(long ms) {
    return ms < 0 ? ("> " + (it.unibz.precise.check.ConsistencyCheckerTest.TIMEOUT_MIN)) + " min" : java.lang.String.format("%,d", ms);
}