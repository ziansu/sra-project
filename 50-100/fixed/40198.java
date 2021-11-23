@java.lang.Override
public org.apache.hadoop.yarn.api.records.Resource roundDown(org.apache.hadoop.yarn.api.records.Resource r, org.apache.hadoop.yarn.api.records.Resource stepFactor) {
    return org.apache.hadoop.yarn.util.resource.Resources.createResource(roundDown(r.getMemory(), stepFactor.getMemory()), roundDown(r.getVirtualCores(), stepFactor.getVirtualCores()), roundDown(r.getGpuMemory(), stepFactor.getGpuMemory()));
}