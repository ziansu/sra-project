private java.lang.StringBuilder createDeplyomentFunctionDefinition() {
    java.lang.StringBuilder source = new java.lang.StringBuilder("");
    source.append(hu.elte.txtuml.export.cpp.templates.GenerationTemplates.cppInclude(hu.elte.txtuml.export.cpp.thread.ThreadHandlingManager.ConfigurationFile));
    source.append(hu.elte.txtuml.export.cpp.templates.GenerationTemplates.putNamespace(hu.elte.txtuml.export.cpp.templates.GenerationTemplates.simpleFunctionDef(GenerationTemplates.MyRuntimeName, hu.elte.txtuml.export.cpp.thread.ThreadHandlingManager.CreatorFunction, createConfiguration().append(createThreadedRuntime()).toString(), GenerationTemplates.RuntimeParamaterName), hu.elte.txtuml.export.cpp.thread.ThreadHandlingManager.NamespaceName));
    return source;
}