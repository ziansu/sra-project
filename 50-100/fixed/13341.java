private de.neofonie.surlgen.processor.spring.JInvocation createMvcUriComponentsBuilderInvocation(de.neofonie.surlgen.processor.core.UrlMethod parameters, java.lang.String methodName, de.neofonie.surlgen.processor.spring.JMethod urlMethod) {
    de.neofonie.surlgen.processor.spring.AbstractJClass mvcUriComponentsBuilder = de.neofonie.surlgen.processor.core.ClassWriter.ref(org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.class);
    de.neofonie.surlgen.processor.spring.JInvocation fromMethodName = mvcUriComponentsBuilder.staticInvoke("fromMethodName");
    if ((baseMvcUriComponentsMethod) != null) {
        fromMethodName.arg(de.neofonie.surlgen.processor.spring.JExpr.invoke(baseMvcUriComponentsMethod));
    }
    fromMethodName.arg(de.neofonie.surlgen.processor.core.ClassWriter.ref(name).dotclass());
    fromMethodName.arg(methodName);
    fromMethodName.arg(parameters.createVarArgArray(urlMethod));
    return fromMethodName;
}