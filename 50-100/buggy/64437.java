@org.junit.Test
public void test_olderThan_lt_oldest() throws java.io.IOException {
    jenkins.widgets.HistoryPageFilter<hudson.model.ModelObject> historyPageFilter = newPage(5, null, 0L);
    java.util.List<hudson.model.ModelObject> itemList = new java.util.ArrayList<hudson.model.ModelObject>();
    itemList.addAll(newRuns(1, 10));
    historyPageFilter.add(itemList);
    org.junit.Assert.assertEquals(true, historyPageFilter.hasUpPage);
    org.junit.Assert.assertEquals(false, historyPageFilter.hasDownPage);
    org.junit.Assert.assertEquals(0, historyPageFilter.runs.size());
}