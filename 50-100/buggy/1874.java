@java.lang.Override
public java.util.Set<org.thymeleaf.processor.IProcessor> getProcessors(java.lang.String dialectPrefix) {
    java.util.Set<org.thymeleaf.processor.IProcessor> processors = new java.util.LinkedHashSet<org.thymeleaf.processor.IProcessor>();
    processors.add(new org.thymeleaf.standard.processor.StandardXmlNsTagProcessor(this, org.thymeleaf.templatemode.TemplateMode.HTML, dialectPrefix));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrBinaryAttributeTagProcessor(this, "img"));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrBinaryAttributeTagProcessor(this, "input"));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrCssAttributeTagProcessor(this));
    processors.add(new com.github.dtrunk90.thymeleaf.jawr.processor.element.impl.JawrJsAttributeTagProcessor(this));
    return processors;
}