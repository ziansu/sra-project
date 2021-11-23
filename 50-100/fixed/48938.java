private void testGetNonPrivateFeedbackSessions() {
    ______TS("standard success case");
    java.util.List<teammates.common.datatransfer.FeedbackSessionAttributes> fsaList = teammates.test.cases.storage.FeedbackSessionsDbTest.fsDb.getNonPrivateFeedbackSessions();
    assertEquals(fsaList.toString(), 8, fsaList.size());
    for (teammates.common.datatransfer.FeedbackSessionAttributes fsa : fsaList) {
        assertFalse(fsa.isPrivateSession());
    }
}