@java.lang.Override
public void onRegister(php.runtime.env.CompileScope scope) {
    registerConstants(new org.develnext.jphp.zend.ext.standard.LangConstants());
    registerConstants(new org.develnext.jphp.zend.ext.standard.StringConstants());
    registerConstants(new org.develnext.jphp.zend.ext.standard.ArrayConstants());
    registerConstants(new org.develnext.jphp.zend.ext.standard.FileConstants());
    long time = java.lang.System.currentTimeMillis();
    registerFunctions(new org.develnext.jphp.zend.ext.standard.LangFunctions());
    registerFunctions(new org.develnext.jphp.zend.ext.standard.StringFunctions());
    registerFunctions(new org.develnext.jphp.zend.ext.standard.ArrayFunctions());
    registerFunctions(new org.develnext.jphp.zend.ext.standard.FileFunctions());
    php.runtime.Startup.traceWithTime("!!!", time);
}