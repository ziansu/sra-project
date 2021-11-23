@java.lang.Override
public int computeAvailableContainers(org.apache.hadoop.yarn.api.records.Resource available, org.apache.hadoop.yarn.api.records.Resource required) {
    return (available.getMemory()) / (required.getMemory());
}