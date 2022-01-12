@java.lang.Override
public void prepare() {
    if ((hostPath) == null) {
        hostPath = ((((((getContext().getFiles().getLibLocation()) + (getContext().getAddOn().getPlugin().getPluginPath())) + (java.io.File.separator)) + "classes") + (java.io.File.separator)) + "html") + (java.io.File.separator);
    }
    org.intellimate.izou.addon.izouwebcontrol.webserver.WebServer.setHOST_PATH(hostPath);
    org.intellimate.izou.addon.izouwebcontrol.webserver.WebServer.setHOSTNAME(java.lang.System.getProperty("ip-address"));
}