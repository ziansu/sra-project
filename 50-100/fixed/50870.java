@java.lang.Override
public void preapre() throws java.lang.Throwable {
    try {
        ranttu.rapid.jsvm.common.SystemProperty.UseOptimisticCallSite = false;
        ranttu.rapid.jsvm.runtime.JsModule module = loadModule(((getClass().getSimpleName()) + "_Benchmark"), source);
        entry = ranttu.rapid.jsvm.common.ReflectionUtil.getFieldValue(module, "entry");
    } finally {
        ranttu.rapid.jsvm.common.SystemProperty.UseOptimisticCallSite = true;
    }
}