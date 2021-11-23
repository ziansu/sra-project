public void parseInline(java.io.InputStream stream, org.apache.tika.sax.XHTMLContentHandler xhtml, org.apache.tika.parser.ParseContext parseContext, org.apache.tika.parser.ocr.TesseractOCRConfig config) throws java.io.IOException, org.apache.tika.exception.TikaException, org.xml.sax.SAXException {
    if (!(hasTesseract(config)))
        return ;
    
    org.apache.tika.io.TemporaryResources tmp = new org.apache.tika.io.TemporaryResources();
    try {
        org.apache.tika.io.TikaInputStream tikaStream = org.apache.tika.io.TikaInputStream.get(stream, tmp);
        java.io.File tmpImgFile = tmp.createTemporaryFile();
        parse(tikaStream, tmpImgFile, parseContext, xhtml, config, null);
    } finally {
        tmp.dispose();
    }
}