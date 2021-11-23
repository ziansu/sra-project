void storeAttributeInSession(java.lang.String attirubte, java.lang.String parameterName) {
    request.getSession().setAttribute(attirubte, parameterName);
}