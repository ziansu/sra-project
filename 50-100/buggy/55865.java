@java.lang.Override
public javax.xml.transform.Source resolve(java.lang.String href, java.lang.String base) throws javax.xml.transform.TransformerException {
    java.io.InputStream stream = org.apache.camel.component.schematron.processor.ClassPathURIResolver.class.getClassLoader().getResourceAsStream(rulesDir.concat(java.io.File.separator).concat(href));
    if (null != stream) {
        return new javax.xml.transform.stream.StreamSource(stream);
    }else {
        if (null != (clientUriResolver)) {
            return clientUriResolver.resolve(href, base);
        }else {
            return new javax.xml.transform.stream.StreamSource(stream);
        }
    }
}