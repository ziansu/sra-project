@org.junit.Test
public void test_newerThan_gt_newest() throws java.io.IOException {
    jenkins.widgets.HistoryPageFilter<hudson.model.ModelObject> historyPageFilter = newPage(5, 11L, null);
    java.util.List<hudson.model.ModelObject> itemList = new java.util.ArrayList<hudson.model.ModelObject>();
    itemList.addAll(newRuns(1, 10));
    historyPageFilter.add(itemList);
    org.junit.Assert.assertEquals(false, historyPageFilter.hasUpPage);
    org.junit.Assert.assertEquals(true, historyPageFilter.hasDownPage);
    org.junit.Assert.assertEquals(0, historyPageFilter.runs.size());
}