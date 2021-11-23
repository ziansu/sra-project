private static void postProcessField(net.abstractfactory.plum.interaction.rich.field.RichField field, java.lang.Object bean, java.lang.annotation.Annotation[] annotations) {
    field.setBean(bean);
    java.lang.String defaultDisplayName = field.getName();
    field.setDisplayName(defaultDisplayName);
    field.setValueAccessor(new net.abstractfactory.plum.interaction.rich.field.BeanFieldValueAccessor(bean, field.getName()));
    net.abstractfactory.plum.interaction.RichFieldAnnotationProcessorFactory.getInstance().processAnnotations(field, annotations);
}