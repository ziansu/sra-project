private boolean containsService(java.lang.Class<?> type, java.lang.String serviceClassName) {
    java.util.Map<java.lang.String, java.lang.Object> services = servicesLoaded.get(type);
    if (services == null) {
        return false;
    }
    return services.containsKey(serviceClassName);
}