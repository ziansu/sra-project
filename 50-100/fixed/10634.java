public void handle(org.dsa.iot.dslink.node.actions.ActionResult event) {
    try {
        com.serotonin.bacnet4j.type.constructed.PriorityArray priorities = getPriorityArray();
        if (priorities == null)
            return ;
        
        for (int i = 1; i <= (priorities.getCount()); i++) {
            relinquish(i);
        }
        refreshPriorities();
    } catch (com.serotonin.bacnet4j.exception.BACnetException e) {
        bacnet.BacnetPoint.LOGGER.error("error: ", e);
    }
}