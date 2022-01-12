public void run() {
    try {
        org.apache.ivory.entity.parser.ProcessEntityParser parser = ((org.apache.ivory.entity.parser.ProcessEntityParser) (org.apache.ivory.entity.parser.EntityParserFactory.getParser(EntityType.PROCESS)));
        parser.parseAndValidate(this.getClass().getResourceAsStream(org.apache.ivory.entity.parser.PROCESS_XML));
    } catch (org.apache.ivory.entity.parser.ValidationException e) {
        throw new java.lang.RuntimeException(e);
    }
}