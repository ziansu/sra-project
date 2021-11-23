protected com.google.common.base.Optional<java.util.Map<java.lang.String, java.util.Map<org.zanata.common.LocaleId, org.zanata.client.commands.PushPullCommand.TranslatedPercent>>> prepareStatsIfApplicable(boolean pullTarget, org.zanata.client.config.LocaleList locales) {
    com.google.common.base.Optional<java.util.Map<java.lang.String, java.util.Map<org.zanata.common.LocaleId, org.zanata.client.commands.PushPullCommand.TranslatedPercent>>> optionalStats = com.google.common.base.Optional.absent();
    if (needToGetStatistics(pullTarget)) {
        optionalStats = com.google.common.base.Optional.of(getDocsTranslatedPercent(locales));
    }
    return optionalStats;
}