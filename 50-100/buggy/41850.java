@java.lang.Override
public java.lang.String execute() throws java.lang.Exception {
    org.iweb.sys.ContextHelper.isPermit("SYS_MANAGER_FILESYSTEM_SHOW");
    org.iweb.sys.DESPassword d = new org.iweb.sys.DESPassword();
    date = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    validata = d.passwordEncrypt(date);
    root = org.iweb.sys.ContextHelper.getUserLoginInfo().getFilesystem_root();
    if (org.iweb.sys.ToolsUtil.isEmpty(root)) {
        root = "/";
    }
    user = org.iweb.sys.ContextHelper.getUserLoginTitle();
    return SUCCESS;
}