public com.tg.rpc.core.bootstrap.Server build() {
    java.lang.System.out.println(("---------" + (serviceName)));
    org.apache.commons.lang3.Validate.isTrue(((port) > 0), "port can't be negative, port:%d", port);
    org.apache.commons.lang3.Validate.isTrue(((maxCapacity) > 0), "maxCapacity can't be negative, maxCapacity:%d", maxCapacity);
    org.apache.commons.lang3.Validate.notEmpty(serviceName, "serviceName can't be empty");
    org.apache.commons.lang3.Validate.notEmpty(serviceId, "serverName can't be empty");
    org.apache.commons.lang3.Validate.notNull(responseHandler, "responseHandler can't be null");
    return new com.tg.rpc.core.bootstrap.Server(port, maxCapacity, serviceName, serviceId, responseHandler, serviceRegistry);
}