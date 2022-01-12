private void scanScriptSource(net.nexustools.njs.compiler.ScriptData script, net.nexustools.njs.compiler.JavaTranspiler.ScopeOptimizer variableScope) {
    scanParsedSource(script.impl, variableScope);
    if (!(script.functions.isEmpty())) {
        variableScope.markUseTypedClassStack();
        for (net.nexustools.njs.compiler.Function function : script.functions.values()) {
            scanScriptSource(function.impl, new net.nexustools.njs.compiler.JavaTranspiler.FunctionScopeOptimizer(variableScope));
        }
    }
}