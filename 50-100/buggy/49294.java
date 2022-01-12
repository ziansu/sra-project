@java.lang.Override
protected void preHead(org.apache.hadoop.yarn.server.applicationhistoryservice.webapp.Page.HTML<org.apache.hadoop.yarn.server.applicationhistoryservice.webapp._> html) {
    commonPreHead(html);
    set(org.apache.hadoop.yarn.webapp.view.JQueryUI.DATATABLES_ID, "apps");
    set(org.apache.hadoop.yarn.webapp.view.JQueryUI.initID(org.apache.hadoop.yarn.webapp.view.JQueryUI.DATATABLES, "apps"), org.apache.hadoop.yarn.server.webapp.WebPageUtils.appsTableInit());
    setTableStyles(html, "apps", ".queue {width:6em}", ".ui {width:8em}");
    java.lang.String reqState = $(org.apache.hadoop.yarn.webapp.YarnWebParams.APP_STATE);
    reqState = ((reqState == null) || (reqState.isEmpty())) ? "All" : reqState;
    setTitle(org.apache.hadoop.yarn.util.StringHelper.sjoin(reqState, "Applications"));
}