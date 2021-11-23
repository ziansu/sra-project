private java.lang.String createMaganerCppCource() {
    java.lang.String source = "";
    source = source + (hu.elte.txtuml.export.cpp.templates.GenerationTemplates.CppInclude(hu.elte.txtuml.export.cpp.thread.ThreadHandlingManager.ThreadManagerName));
    source = source + (createConstructorHead());
    if (isThreadHandling) {
        source = source + (createConstructorBody());
    }else {
        source = source + "{}";
    }
    return source;
}