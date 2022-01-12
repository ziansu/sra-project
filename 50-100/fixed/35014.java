public com.blackbirdai.client.model.UploadRequest withDocStrings(java.util.List<java.lang.String> docStrings) throws com.blackbirdai.client.InvalidRequestException {
    this.docs = com.google.common.collect.Lists.newArrayListWithCapacity(docStrings.size());
    for (java.lang.String s : docStrings) {
        try {
            com.fasterxml.jackson.databind.JsonNode json = Document.Reader.readValue(s);
            this.docs.add(json);
        } catch (java.lang.Exception e) {
            throw new com.blackbirdai.client.InvalidRequestException("Document is in invalid JSON format", e);
        }
    }
    return this;
}