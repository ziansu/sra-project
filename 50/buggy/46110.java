public static int getCount(java.lang.String agencyId) {
    return org.transitime.ipc.rmi.RmiCallInvocationHandler.getAccessCounter(agencyId).current;
}