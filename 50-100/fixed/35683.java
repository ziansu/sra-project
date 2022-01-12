@java.lang.Override
public org.apache.wicket.markup.IMarkupFragment getMarkup(final org.apache.wicket.MarkupContainer container, final org.apache.wicket.Component child) {
    org.apache.wicket.markup.IMarkupFragment markup = container.getMarkup();
    if (markup == null) {
        return null;
    }
    if (child == null) {
        return markup;
    }
    markup = markup.find(child.getId());
    if (markup != null) {
        return markup;
    }
    markup = searchMarkupInTransparentResolvers(container, child);
    return markup;
}