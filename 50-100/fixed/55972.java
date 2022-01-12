@org.junit.Test(expected = java.lang.Exception.class)
public void createWithNegativeIterations() throws java.lang.Exception {
    final java.util.List<uk.co.real_logic.aeron.tools.RateControllerInterval> ivlsList = new java.util.ArrayList<uk.co.real_logic.aeron.tools.RateControllerInterval>();
    final uk.co.real_logic.aeron.tools.RateControllerInterval ivl = new uk.co.real_logic.aeron.tools.MessagesAtMessagesPerSecondInterval(1, 1);
    ivlsList.add(ivl);
    rc = new uk.co.real_logic.aeron.tools.RateController(() -> {
        return 0;
    }, ivlsList, (-1));
}