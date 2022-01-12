protected void onArchivedCaseNotFound() {
    org.bonitasoft.web.toolkit.client.ViewController.showPopup(new org.bonitasoft.web.toolkit.client.ui.page.ItemNotFoundPopup() {
        @java.lang.Override
        protected org.bonitasoft.web.toolkit.client.ui.action.Action getRedirectionAction() {
            return new org.bonitasoft.web.toolkit.client.ui.action.Action() {
                @java.lang.Override
                public void execute() {
                    com.google.gwt.user.client.History.newItem(("?_pf=" + (org.bonitasoft.web.toolkit.client.ClientApplicationURL.getProfileId())));
                }
            };
        }
    });
}