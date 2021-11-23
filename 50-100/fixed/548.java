private void printAttributes(javax.servlet.http.HttpServletRequest request) {
    if (request != null) {
        final java.util.Enumeration<java.lang.String> attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            final java.lang.String name = attributeNames.nextElement();
            java.lang.System.out.println(((name + ": ") + (request.getAttribute(name).toString())));
        } 
    }
}