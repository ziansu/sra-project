public javax.xml.bind.JAXBContext getContext(java.lang.Class<?> objectType) {
    java.lang.System.out.println("TUG CALL");
    for (java.lang.Class type : types) {
        if (type == objectType) {
            return context;
        }
    }
    return null;
}