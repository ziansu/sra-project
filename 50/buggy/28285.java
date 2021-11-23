public static java.lang.String render(@javax.annotation.Nonnull
java.lang.String source, models.Project project, boolean breaks) {
    utils.AutoLinkRenderer autoLinkRenderer = new utils.AutoLinkRenderer(utils.Markdown.renderWithHighlight(source, breaks), project);
    return autoLinkRenderer.render();
}