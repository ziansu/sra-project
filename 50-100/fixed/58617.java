public static java.util.Locale getLanguage(org.literacybridge.acm.content.AudioItem audioItem, org.literacybridge.acm.metadata.MetadataField<org.literacybridge.acm.metadata.RFC3066LanguageCode> language) {
    for (org.literacybridge.acm.metadata.MetadataValue<org.literacybridge.acm.metadata.RFC3066LanguageCode> mv : audioItem.getMetadata().getMetadataValues(language)) {
        org.literacybridge.acm.metadata.RFC3066LanguageCode code = mv.getValue();
        return code.getLocale();
    }
    return null;
}