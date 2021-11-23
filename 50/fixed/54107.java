@java.lang.Override
public void register(final co.cask.cdap.proto.Id.Program programId, final co.cask.cdap.proto.Id.DatasetInstance datasetInstanceId) {
    execute(new org.apache.tephra.TransactionExecutor.Procedure<co.cask.cdap.data2.registry.UsageDataset>() {
        @java.lang.Override
        public void apply(co.cask.cdap.data2.registry.UsageDataset usageDataset) throws java.lang.Exception {
            usageDataset.register(programId, datasetInstanceId);
        }
    });
}