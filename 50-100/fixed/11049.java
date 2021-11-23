java.util.Set<java.lang.String> getVocabularyCodes(java.net.URL url, org.obiba.opal.core.service.validation.VocabularyImporter importer) throws java.io.IOException, java.security.GeneralSecurityException {
    if ("https".equals(url.getProtocol())) {
        return getVocabularyCodesHttps(url, importer);
    }else {
        try (java.io.InputStream in = url.openStream()) {
            return importer.getCodes(in);
        }
    }
}