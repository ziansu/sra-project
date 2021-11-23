@javax.annotation.PostConstruct
public void init() {
    com.cisco.oss.foundation.http.server.HttpMethodFilter.methods.add("TRACE");
    updateAllowedMethodsFromConfig(serviceName);
}