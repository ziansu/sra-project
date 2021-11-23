@com.fasterxml.jackson.annotation.JsonIgnore
public java.util.List<com.netflix.appinfo.InstanceInfo> getInstancesAsIsFromEureka() {
    return new java.util.ArrayList<com.netflix.appinfo.InstanceInfo>(this.instances);
}