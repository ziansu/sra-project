public static java.io.InputStream loadResourceAsStream(final java.lang.String resourceName) {
    java.io.InputStream input = null;
    try {
        input = new java.io.FileInputStream(resourceName);
    } catch (java.io.FileNotFoundException e) {
        javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_ERROR, null, "File not found in the provided location"));
        e.printStackTrace();
    }
    return input;
}