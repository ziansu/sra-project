@java.lang.Override
public java.lang.Class<? extends de.cau.cs.se.instrumentation.rl.IGlobalScopeProvider> bindIGlobalScopeProvider() {
    if (true) {
        return de.cau.cs.se.instrumentation.rl.typing.jar.JarModelGlobalScopeProvider.class;
    }else {
        return de.cau.cs.se.instrumentation.rl.typing.BaseTypeGlobalScopeProvider.class;
    }
}