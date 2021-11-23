@java.lang.Override
public javax.xml.transform.Source resolve(java.lang.String href, java.lang.String base) throws javax.xml.transform.TransformerException {
    java.io.InputStream stream = org.apache.camel.component.schematron.processor.ClassPathURIResolver.class.getClassLoader().getResourceAsStream(rulesDir.concat(java.io.File.separator).concat(href));
    if (stream != null) {
        return new javax.xml.transform.stream.StreamSource(stream);
    }else {
        if ((clientUriResolver) != null) {
            return clientUriResolver.resolve(href, base);
        }else {
            return new javax.xml.transform.stream.StreamSource(stream);
        }
    }
}