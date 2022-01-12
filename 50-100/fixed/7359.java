@java.lang.Override
public void setHtmltopdf(java.lang.String htmlString, java.lang.String collectionTitle) {
    this.analyticService.setHTMLtoPDF(htmlString, collectionTitle, false, new com.google.gwt.user.client.rpc.AsyncCallback<java.lang.String>() {
        @java.lang.Override
        public void onSuccess(java.lang.String result) {
            getView().getFrame().setUrl(result);
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
        }
    });
}