@java.lang.Override
public void configConstant(com.jfinal.config.Constants me) {
    com.jfinal.kit.PropKit.use("Config.properties");
    me.setDevMode(true);
    me.setEncoding("utf-8");
    me.setViewType(ViewType.JSP);
    me.setBaseUploadPath(com.jfinal.kit.PropKit.get("baseUploadPath"));
}