@org.junit.Test
public void testFindLost() throws java.io.IOException {
    if ((target) != null) {
        int count = 5;
        int limit = 3;
        java.util.Set<java.util.UUID> uuids = createProcesses(count, false);
        finishProcesses(uuids);
        ru.taskurotta.service.common.ResultSetCursor<java.util.UUID> rsc = target.findLostProcesses(((java.lang.System.currentTimeMillis()) + 60000L), 10L, limit);
        validateResultSetCursor(rsc, limit, uuids, count);
        rsc.close();
    }
}