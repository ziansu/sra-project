public java.lang.String render(final java.lang.String markdown) {
    org.publo.model.PageMarkup.LOGGER.info("Rendering the markup.");
    final java.lang.String rendered = org.publo.controller.utils.MarkdownParser.parse(markdown);
    return org.publo.controller.utils.TemplateRenderer.render(pageTemplate.getTemplate().getValue(), rendered);
}