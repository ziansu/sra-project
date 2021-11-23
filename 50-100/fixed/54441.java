@java.lang.Override
public co.cask.cdap.api.dataset.lib.partitioned.PartitionConsumerResult doConsume(co.cask.cdap.api.dataset.lib.partitioned.ConsumerWorkingSet workingSet, co.cask.cdap.api.dataset.lib.partitioned.PartitionAcceptor acceptor) {
    doExpiry(workingSet);
    workingSet.populate(getPartitionedFileSet(), getConfiguration());
    java.util.List<co.cask.cdap.api.dataset.lib.PartitionDetail> toConsume = selectPartitions(acceptor, workingSet);
    return new co.cask.cdap.api.dataset.lib.partitioned.PartitionConsumerResult(toConsume, removeDiscardedPartitions(workingSet));
}