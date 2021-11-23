@java.lang.Override
public void setHtmltopdf(java.lang.String htmlString, java.lang.String fileName, final boolean isClickedOnEmail) {
    this.analyticService.setHTMLtoPDF(htmlString, fileName, new com.google.gwt.user.client.rpc.AsyncCallback<java.lang.String>() {
        @java.lang.Override
        public void onSuccess(java.lang.String result) {
            if (isClickedOnEmail) {
                getView().setPdfForEmail(result);
            }else {
                java.lang.System.out.println(("result::" + result));
                getView().getFrame().setUrl(result);
            }
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
        }
    });
}