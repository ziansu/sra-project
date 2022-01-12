public static void populateIvySettingsWithPublishRepo(org.apache.ivy.core.settings.IvySettings ivySettings, org.jerkar.api.depmanagement.JkPublishRepos repos) {
    for (final org.jerkar.api.depmanagement.JkPublishRepo repo : repos) {
        final org.apache.ivy.plugins.resolver.DependencyResolver resolver = org.jerkar.api.depmanagement.IvyTranslations.toResolver(repo.repo(), repo.checksumAlgorithms());
        resolver.setName(((org.jerkar.api.depmanagement.IvyTranslations.PUBLISH_RESOLVER_NAME) + (repo.repo().url())));
        ivySettings.addResolver(resolver);
    }
}