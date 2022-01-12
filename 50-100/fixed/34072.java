@com.opensymphony.xwork2.inject.Inject
public void setContainer(com.opensymphony.xwork2.inject.Container container) {
    super.setContainer(container);
    constants = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (java.lang.String key : container.getInstanceNames(java.lang.String.class)) {
        constants.put(key, container.getInstance(java.lang.String.class, key));
    }
}