public com.jadieldearmas.codegenerator.JCodedBody addCodedBody() throws java.lang.UnsupportedOperationException {
    if (!(this.isBodyAdded)) {
        com.jadieldearmas.codegenerator.JCodedBody body = new com.jadieldearmas.codegenerator.JCodedBody();
        this.addNewChildTemplate("body", body);
        this.isBodyAdded = true;
        this.textBody = null;
        return body;
    }
    throw new java.lang.UnsupportedOperationException("The body of the constructor has been added already.");
}