public void init() throws java.lang.Exception {
    com.neverwinterdp.scribengin.dataflow.DataflowRegistry dRegistry = container.getDataflowRegistry();
    com.neverwinterdp.scribengin.dataflow.DataflowTaskReport report = dRegistry.getTaskReport(descriptor);
    context = new com.neverwinterdp.scribengin.dataflow.DataflowTaskContext(container, descriptor, report);
    descriptor.setStatus(Status.PROCESSING);
    dRegistry.dataflowTaskUpdate(descriptor);
    dRegistry.dataflowTaskReport(descriptor, report);
}