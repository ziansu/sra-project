private void runTimeTest(java.util.ArrayList<process.Event> expected) {
    org.joda.time.DateTime time = new org.joda.time.DateTime(2012, 1, 10, 10, 50, 0);
    myCal.eventsAtTime(time);
    java.util.List<process.Event> actual = myCal.getList();
    org.junit.Assert.assertTrue(actual.equals(expected));
}