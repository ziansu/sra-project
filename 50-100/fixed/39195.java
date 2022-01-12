@com.google.common.annotations.VisibleForTesting
mikesaelim.arxivoaiharvester.io.ArxivResponse parseXMLStream(java.io.InputStream inputStream) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    javax.xml.parsers.SAXParser parser = javax.xml.parsers.SAXParserFactory.newInstance().newSAXParser();
    mikesaelim.arxivoaiharvester.io.ArxivResponse.ArxivResponseBuilder responseBuilder = mikesaelim.arxivoaiharvester.io.ArxivResponse.builder().arxivRequest(arxivRequest);
    parser.parse(inputStream, new mikesaelim.arxivoaiharvester.XMLHandler(responseBuilder));
    return responseBuilder.build();
}