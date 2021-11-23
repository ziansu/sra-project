private static void setupPrettyPrint(final javax.xml.bind.Marshaller marshaller, final boolean value) {
    try {
        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, value);
    } catch (javax.xml.bind.PropertyException e) {
        throw new java.lang.IllegalStateException("Unable to setup pretty print", e);
    }
}