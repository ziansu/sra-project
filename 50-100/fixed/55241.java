@org.junit.Test
public void testGetEventsSimple() {
    org.imixs.workflow.ItemCollection workitem = database.get("W0000-00001");
    workitem.replaceItemValue(WorkflowService.PROCESSID, 200);
    java.util.List<org.imixs.workflow.ItemCollection> eventList = null;
    try {
        eventList = workflowService.getEvents(workitem);
    } catch (org.imixs.workflow.exceptions.ModelException e) {
        e.printStackTrace();
        junit.framework.Assert.fail();
    }
    junit.framework.Assert.assertEquals(1, eventList.size());
}