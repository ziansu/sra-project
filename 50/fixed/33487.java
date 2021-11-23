@java.lang.Override
public void init() {
    customScriptProvider = new org.spo.fw.launch.CustomScriptProvider();
    customScriptProvider.init();
    ignoreCustomStrategy = false;
    strategy.isRecordMode = false;
    strategy.browserName = "ie";
    strategy.textFilesPath = "C:\\spo_WorkingDir\\";
    strategy.isProxyServerRequired = false;
    strategy.requireBasicAuthUrlPrefix = true;
    strategy.requireBasicAuthUrlPrefix = true;
}