@org.jboss.errai.ioc.client.api.AfterInitialization
private void init() {
    menuToggle.addClickHandler(new com.google.gwt.event.dom.client.ClickHandler() {
        @java.lang.Override
        public void onClick(final com.google.gwt.event.dom.client.ClickEvent event) {
            menuIsShowed = !(menuIsShowed);
            if (menuIsShowed) {
                com.google.gwt.user.client.DOM.getElementById("nav-gauche").setClassName("aside-gauche");
            }else {
                com.google.gwt.user.client.DOM.getElementById("nav-gauche").setClassName("aside-gauche minimize");
            }
        }
    });
    breadcrumb.refresh();
}