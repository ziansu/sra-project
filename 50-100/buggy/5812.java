@java.lang.Override
public java.lang.Object apply(java.lang.String moduleId) {
    try {
        java.io.File module = net.orzo.scripting.JsEngineAdapter.findModule(this.envParams.modulesPaths, moduleId);
        if (module != null) {
            return loadModule(net.orzo.scripting.SourceCode.fromFile(module));
        }else {
            throw new net.orzo.scripting.ModuleException(java.lang.String.format("Module <%s> not found.", moduleId));
        }
    } catch (java.io.IOException | javax.script.ScriptException e) {
        throw new net.orzo.scripting.ModuleException(java.lang.String.format("Failed to load module <%s> with error %s", moduleId, e.getMessage()), e);
    }
}