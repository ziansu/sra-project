protected void initialize() {
    setTimeout();
    setTitle(getStringResource("title"));
    add(new org.apache.wicket.markup.html.basic.Label("pageTitle", new org.apache.wicket.model.PropertyModel<java.lang.String>(this, "title")));
    add(new org.dcache.webadmin.view.panels.header.HeaderPanel("headerPanel"));
    add(new org.dcache.webadmin.view.panels.userpanel.UserPanel("userPanel"));
    add(new org.dcache.webadmin.view.panels.navigation.BasicNavigationPanel("navigationPanel", this.getClass()));
}