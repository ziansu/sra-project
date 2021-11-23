protected void initialize() {
    setTimeout();
    add(new org.apache.wicket.markup.html.basic.Label("pageTitle", new org.apache.wicket.model.ResourceModel("title")));
    add(new org.dcache.webadmin.view.panels.header.HeaderPanel("headerPanel"));
    add(new org.dcache.webadmin.view.panels.userpanel.UserPanel("userPanel", this));
    org.dcache.webadmin.view.panels.navigation.BasicNavigationPanel navigation = new org.dcache.webadmin.view.panels.navigation.BasicNavigationPanel("navigationPanel", this.getClass());
    add(navigation);
}