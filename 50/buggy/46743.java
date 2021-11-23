private org.springframework.cloud.client.ServiceInstance getInstanceOfService(java.lang.String service) throws java.lang.InstantiationException {
    org.springframework.cloud.client.ServiceInstance instance = loadBalancer.choose(service);
    if (null != instance) {
        return instance;
    }else {
        throw new java.lang.InstantiationException("service is not available");
    }
}