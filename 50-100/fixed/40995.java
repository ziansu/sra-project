@java.lang.Override
public void onEnable() {
    com.github.nathannr.buildmode.yaml.Language.initLang();
    regEvents();
    com.github.nathannr.buildmode.yaml.Config.initConfig();
    initCmd();
    checkUpdate();
    initMetrics();
    java.lang.System.out.println(((((cprefix) + "Plugin by NathanNr version ") + (getDescription().getVersion())) + " enabled!"));
}