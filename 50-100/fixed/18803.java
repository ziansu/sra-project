private void updateWindowDecorations(final nl.lxtreme.ols.client.Project aProject) {
    java.lang.String title = this.controller.getHostProperties().getFullName();
    if ((aProject != null) && (!(nl.lxtreme.ols.client.StringUtils.isEmpty(aProject.getName())))) {
        title = title.concat(" :: ").concat(aProject.getName());
    }
    setTitle(title);
    getRootPane().putClientProperty("Window.documentModified", java.lang.Boolean.valueOf(aProject.isChanged()));
}