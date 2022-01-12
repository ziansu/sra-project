public static java.lang.String renderFileInCodeBrowser(@javax.annotation.Nonnull
java.lang.String source, models.Project project) {
    java.lang.String imageLinkFilter = utils.Markdown.replaceImageLinkPath(project, source);
    utils.AutoLinkRenderer autoLinkRenderer = new utils.AutoLinkRenderer(utils.Markdown.renderWithHighlight(imageLinkFilter, true), project);
    return autoLinkRenderer.render(null);
}