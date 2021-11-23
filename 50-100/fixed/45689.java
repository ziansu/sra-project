void saveContext() throws java.lang.Exception {
    com.neverwinterdp.scribengin.dataflow.DataflowRegistry dRegistry = container.getDataflowRegistry();
    context.commit();
    context.close();
    com.neverwinterdp.scribengin.dataflow.DataflowTaskReport report = context.getReport();
    report.setFinishTime(java.lang.System.currentTimeMillis());
    dRegistry.dataflowTaskReport(descriptor, report);
}