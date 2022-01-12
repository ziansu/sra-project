@org.junit.Test
public void testFindIncomplete() throws java.io.IOException, java.lang.InterruptedException {
    if ((target) != null) {
        int count = 5;
        int limit = 3;
        java.util.Set<java.util.UUID> uuids = createProcesses(5);
        ru.taskurotta.service.common.ResultSetCursor<java.util.UUID> rsc = target.findIncompleteProcesses(((java.lang.System.currentTimeMillis()) + 60000L), limit);
        validateResultSetCursor(rsc, limit, uuids, count);
        rsc.close();
    }
}