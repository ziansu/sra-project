@com.google.common.annotations.VisibleForTesting
mikesaelim.arxivoaiharvester.io.ArxivResponse parseXMLStream(java.io.InputStream inputStream) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, java.nio.charset.Charset.forName("UTF-8"));
    mikesaelim.arxivoaiharvester.NewlineFilterReader newlineFilterReader = new mikesaelim.arxivoaiharvester.NewlineFilterReader(inputStreamReader);
    org.xml.sax.InputSource filteredInputSource = new org.xml.sax.InputSource(newlineFilterReader);
    javax.xml.parsers.SAXParser parser = javax.xml.parsers.SAXParserFactory.newInstance().newSAXParser();
    mikesaelim.arxivoaiharvester.io.ArxivResponse.ArxivResponseBuilder responseBuilder = mikesaelim.arxivoaiharvester.io.ArxivResponse.builder().arxivRequest(arxivRequest);
    parser.parse(filteredInputSource, new mikesaelim.arxivoaiharvester.XMLHandler(responseBuilder));
    return responseBuilder.build();
}