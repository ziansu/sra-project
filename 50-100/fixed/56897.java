@com.giisoo.app.web.admin.Path(login = true, access = "access.config.admin")
public final void onGet() {
    if ((com.giisoo.app.web.admin.setting.settings.size()) > 0) {
        java.lang.String name = com.giisoo.app.web.admin.setting.settings.keySet().iterator().next();
        this.set("name", name);
        get(name);
        return ;
    }
    this.println("not find page");
}