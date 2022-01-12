protected org.collegeopentextbooks.api.model.License insert(org.collegeopentextbooks.api.model.License license) {
    java.util.Map<java.lang.String, java.lang.Object> parameters = new java.util.HashMap<java.lang.String, java.lang.Object>(2);
    parameters.put("id", license.getId());
    parameters.put("description", license.getDescription());
    this.insert.execute(parameters);
    return license;
}