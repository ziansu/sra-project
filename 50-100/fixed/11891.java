@javax.annotation.Nullable
@java.lang.Override
public org.metaborg.spoofax.core.project.configuration.ISpoofaxLanguageSpecConfig get(final org.metaborg.core.project.ILanguageSpec languageSpec) throws java.io.IOException {
    @javax.annotation.Nullable
    org.metaborg.spoofax.core.project.configuration.ISpoofaxLanguageSpecConfig config = this.configurationBasedLanguageSpecConfigService.get(languageSpec);
    if ((config == null) && (languageSpec instanceof org.metaborg.core.project.IProject)) {
        @javax.annotation.Nullable
        final org.metaborg.spoofax.core.project.settings.LegacySpoofaxProjectSettings settings;
        try {
            settings = this.settingsService.get(((org.metaborg.core.project.IProject) (languageSpec)));
        } catch (org.metaborg.core.project.ProjectException e) {
            throw new java.io.IOException(e);
        }
        if (settings != null) {
            config = new org.metaborg.spoofax.core.project.configuration.LegacySpoofaxLanguageSpecConfig(settings);
        }
    }
    return config;
}