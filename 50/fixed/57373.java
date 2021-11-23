public static void internalOnlyInvokeTestFailure(java.lang.String failureKey) {
    java.lang.String invokeArtificialFailure = com.emc.storageos.util.InvokeTestFailure._coordinator.getPropertyInfo().getProperty(com.emc.storageos.util.InvokeTestFailure.ARTIFICIAL_FAILURE);
    if ((invokeArtificialFailure != null) && (invokeArtificialFailure.contains(failureKey))) {
        throw new java.lang.NullPointerException("Artificially Thrown Exception");
    }
}