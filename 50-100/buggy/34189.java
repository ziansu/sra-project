@java.lang.Override
protected void configure() {
    install(new com.urswolfer.intellij.plugin.gerrit.ui.filter.GerritFilterModule());
    bind(com.urswolfer.intellij.plugin.gerrit.ui.GerritSelectRevisionInfoColumn.class).asEagerSingleton();
    com.google.inject.multibindings.Multibinder<com.urswolfer.intellij.plugin.gerrit.ui.GerritChangeNodeDecorator> decorators = com.google.inject.multibindings.Multibinder.newSetBinder(binder(), com.urswolfer.intellij.plugin.gerrit.ui.GerritChangeNodeDecorator.class);
    decorators.addBinding().to(com.urswolfer.intellij.plugin.gerrit.ui.GerritCommentCountChangeNodeDecorator.class);
    bind(com.urswolfer.intellij.plugin.gerrit.ui.RepositoryChangesBrowserProvider.class);
    bind(com.urswolfer.intellij.plugin.gerrit.ui.SettingsPanel.class);
    bind(com.urswolfer.intellij.plugin.gerrit.ui.GerritSettingsConfigurable.class);
    bind(com.urswolfer.intellij.plugin.gerrit.ui.GerritUpdatesNotificationComponent.class).asEagerSingleton();
    bind(com.urswolfer.intellij.plugin.gerrit.ui.GerritChangeListPanel.class).asEagerSingleton();
}