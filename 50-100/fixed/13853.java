public void actionCommit() throws java.io.IOException, javax.servlet.ServletException {
    java.util.List errors = new java.util.ArrayList();
    java.util.Map params = new java.util.HashMap();
    params.put(org.opencms.workplace.tools.database.PARAM_FILE, getImportFile());
    params.put(org.opencms.workplace.tools.database.CmsDatabaseImportFromServer.PARAM_KEEPPERMISSIONS.toLowerCase(), getKeepPermissions());
    params.put(org.opencms.workplace.tools.database.PARAM_STYLE, CmsToolDialog.STYLE_NEW);
    params.put(org.opencms.workplace.tools.database.PARAM_CLOSELINK, org.opencms.workplace.tools.CmsToolManager.linkForToolPath(getJsp(), "/database"));
    getToolManager().jspForwardPage(this, org.opencms.workplace.tools.database.CmsDatabaseImportFromServer.IMPORT_ACTION_REPORT, params);
    setCommitErrors(errors);
}