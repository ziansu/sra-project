private static boolean hasError(org.apache.wicket.markup.html.form.FormComponent<?> formComponent) {
    return ((formComponent.getMetaData(fr.openwide.core.wicket.more.util.listener.FormErrorDecoratorListener.HAS_ERROR)) != null) || (!(formComponent.isValid()));
}