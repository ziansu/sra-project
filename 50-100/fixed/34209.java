private java.lang.String createMaganerCppCource() {
    java.lang.String source = "";
    source = source + (hu.elte.txtuml.export.cpp.templates.GenerationTemplates.CppInclude(hu.elte.txtuml.export.cpp.thread.ThreadHandlingManager.ThreadManagerName.toLowerCase()));
    source = source + (createConstructorHead());
    source = source + (createConstructorBody(isThreadHandling));
    return source;
}