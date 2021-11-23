public void delete(java.lang.Long id) {
    tapp.model.ServiceRegistry myBean = getServiceRegistry(id);
    getServiceRegistrys().remove(myBean);
    new com.appspot.cloudserviceapi.sci.dao.ServiceRegistryDAO().remove(id);
}