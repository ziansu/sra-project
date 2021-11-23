public void processWorkItem(final com.northernwall.hadrian.domain.WorkItem workItem) throws java.io.IOException {
    if (workItem == null) {
        return ;
    }
    workItem.setNextId(null);
    dataAccess.saveWorkItem(workItem);
    executor.submit(() -> {
        process(workItem);
    });
}