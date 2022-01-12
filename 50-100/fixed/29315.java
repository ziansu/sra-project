public static org.apache.hadoop.yarn.api.records.Resource createResource(int memory, int cores, int gpuMemory) {
    org.apache.hadoop.yarn.api.records.Resource resource = org.apache.hadoop.yarn.util.Records.newRecord(org.apache.hadoop.yarn.api.records.Resource.class);
    resource.setMemory(memory);
    resource.setVirtualCores(cores);
    resource.setGpuMemory(gpuMemory);
    return resource;
}