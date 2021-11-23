@java.lang.Override
public java.util.Set<org.thymeleaf.processor.IProcessor> getProcessors(java.lang.String dialectPrefix) {
    java.util.Set<org.thymeleaf.processor.IProcessor> processors = new java.util.LinkedHashSet<org.thymeleaf.processor.IProcessor>();
    processors.add(new org.thymeleaf.standard.processor.StandardXmlNsTagProcessor(org.thymeleaf.templatemode.TemplateMode.HTML, dialectPrefix));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrBinaryAttributeTagProcessor("img"));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrBinaryAttributeTagProcessor("input"));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrCssAttributeTagProcessor());
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrJsAttributeTagProcessor());
    return processors;
}