void saveContext() throws java.lang.Exception {
    com.neverwinterdp.scribengin.dataflow.DataflowRegistry dRegistry = container.getDataflowRegistry();
    com.neverwinterdp.scribengin.dataflow.DataflowTaskReport report = context.getReport();
    context.commit();
    context.close();
    report.setFinishTime(java.lang.System.currentTimeMillis());
    dRegistry.dataflowTaskReport(descriptor, report);
}