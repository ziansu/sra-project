@java.lang.Override
protected void doParse(org.w3c.dom.Element element, org.springframework.beans.factory.xml.ParserContext context, org.springframework.beans.factory.support.BeanDefinitionBuilder builder) {
    super.doParse(element, context, builder);
    java.util.List<?> members = context.getDelegate().parseListElement(element, builder.getBeanDefinition());
    builder.addPropertyValue("members", members);
}