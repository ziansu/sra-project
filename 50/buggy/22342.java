public java.lang.String convert(com.webcohesion.enunciate.util.HasClientConvertibleType element) throws freemarker.template.TemplateModelException {
    javax.lang.model.type.TypeMirror elementType = element.getClientConvertibleType();
    return convert(elementType);
}