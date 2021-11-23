public void registerServiceClass(java.lang.Class serviceClass) {
    registeredServiceClasses.add(serviceClass);
    try {
        org.structr.core.Service service = ((org.structr.core.Service) (serviceClass.newInstance()));
    } catch (java.lang.Throwable t) {
        t.printStackTrace();
    }
}