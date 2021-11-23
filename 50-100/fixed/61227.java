public static boolean isRetryableException(java.lang.Exception exception) {
    if (exception == null) {
        throw new java.lang.IllegalArgumentException("exception cannot be null");
    }
    if (exception instanceof com.microsoft.azure.servicebus.ServiceBusException) {
        return ((com.microsoft.azure.servicebus.ServiceBusException) (exception)).getIsTransient();
    }
    return false;
}