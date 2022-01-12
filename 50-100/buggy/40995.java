@java.lang.Override
public void onEnable() {
    regEvents();
    com.github.nathannr.buildmode.yaml.Language.initLang();
    com.github.nathannr.buildmode.yaml.Config.initConfig();
    initCmd();
    checkUpdate();
    initMetrics();
    java.lang.System.out.println(((((cprefix) + "Plugin by NathanNr version ") + (getDescription().getVersion())) + " enabled!"));
}