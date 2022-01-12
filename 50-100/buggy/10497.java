private void checkExistenceOfRequiredTranslations(java.util.Set<java.io.File> filesInResourceBundle) {
    final java.lang.String fullBundleName = getFullBundleName(filesInResourceBundle);
    final java.lang.String extension = getFileExtensions()[0];
    for (java.lang.String languageCode : requiredTranslations) {
        final java.lang.String translationFileName = ((fullBundleName + '_') + languageCode) + extension;
        final boolean missing = com.puppycrawl.tools.checkstyle.checks.TranslationCheck.isMissing(translationFileName, filesInResourceBundle);
        if (missing) {
            final java.lang.String missingTranslationFileName = formMissingTranslationName(fullBundleName, languageCode);
            logMissingTranslation(missingTranslationFileName);
        }
    }
}