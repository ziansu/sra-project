public void addHeader(java.lang.String sipHeader) {
    try {
        gov.nist.javax.sip.parser.HeaderParser parser = gov.nist.javax.sip.parser.ParserFactory.createParser((sipHeader + "\n"));
        gov.nist.javax.sip.header.SIPHeader sh = parser.parse();
        this.attachHeader(sh, false);
    } catch (java.text.ParseException ex) {
        this.getUnrecognizedHeadersList().add(sipHeader);
    }
}