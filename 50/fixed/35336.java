public static java.lang.String getEnterpriseField(java.lang.String key) {
    java.lang.String name = org.akaza.openclinica.web.SQLInitServlet.entParams.getProperty(key);
    if (name != null) {
        name = name.trim();
    }
    return name == null ? "" : name;
}