private void saveToFile(org.w3c.dom.Document document, java.io.File outputFile, javax.xml.transform.Transformer transformer) throws org.apache.maven.plugin.MojoExecutionException {
    try {
        javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new java.io.FileOutputStream(outputFile));
        javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(document);
        transformer.transform(source, result);
    } catch (javax.xml.transform.TransformerException e) {
        throw new org.apache.maven.plugin.MojoExecutionException("Error during saving to file", e);
    } catch (java.io.FileNotFoundException e) {
        throw new org.apache.maven.plugin.MojoExecutionException("Error during saving to file", e);
    }
}