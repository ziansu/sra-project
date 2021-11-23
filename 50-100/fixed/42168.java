public void setupTmxWriter(final com.vistatec.ocelot.segment.model.OcelotSegment testSeg) throws java.io.IOException {
    mockery.checking(new org.jmock.Expectations() {
        {
            allowing(segService).getNumSegments();
            will(returnValue(1));
            allowing(segService).getSegment(0);
            will(returnValue(testSeg));
        }
    });
    tmxWriter = new com.vistatec.ocelot.tm.okapi.OkapiTmxWriter(segService);
}