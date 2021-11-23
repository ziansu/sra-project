@java.lang.Override
public java.util.List<org.jasig.cas.services.RegisteredService> getAllServices() {
    final java.util.List<org.jasig.cas.services.RegisteredService> allRegisteredServices = getAllRegisteredServices();
    java.util.List<org.jasig.cas.services.RegisteredService> filteredList = new java.util.ArrayList<org.jasig.cas.services.RegisteredService>();
    for (org.jasig.cas.services.RegisteredService service : allRegisteredServices) {
        if (!(filteredServices.contains(service.getName()))) {
            filteredList.add(service);
        }
    }
    return filteredList;
}