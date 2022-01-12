@java.lang.Override
public eu.prowessproject.jeb.results.Result execute(eu.prowessproject.jeb.environment.Environment env) {
    try {
        java.lang.Object result = eu.prowessproject.jeb.utils.ReflectionUtils.safeInvoke(this.method, thisObject.getObject(), eu.prowessproject.jeb.commands.MethodCallCommand.mapGetObjects(paramObjects));
        return new eu.prowessproject.jeb.results.OkMethodCallResult(env.storeVariable(result));
    } catch (java.lang.Throwable a) {
        return new eu.prowessproject.jeb.results.ErrorMethodCallResult();
    }
}