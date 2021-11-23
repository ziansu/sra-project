public static long getTotalCount(java.lang.String agencyId) {
    return org.transitime.ipc.rmi.RmiCallInvocationHandler.getAccessCounter(agencyId).total.get();
}