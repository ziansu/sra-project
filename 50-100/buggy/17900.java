@java.lang.Override
public void onSelect(com.sencha.gxt.widget.core.client.event.SelectEvent event) {
    unsavedChanges = false;
    final com.sencha.gxt.widget.core.client.box.MessageBox box = edu.arizona.biosemantics.etcsite.client.common.Alerter.startLoading();
    matrixGenerationService.completeReview(edu.arizona.biosemantics.etcsite.client.common.Authentication.getInstance().getToken(), task, new com.google.gwt.user.client.rpc.AsyncCallback<edu.arizona.biosemantics.etcsite.shared.model.Task>() {
        @java.lang.Override
        public void onSuccess(edu.arizona.biosemantics.etcsite.shared.model.Task result) {
            edu.arizona.biosemantics.etcsite.client.common.Alerter.stopLoading(box);
            placeController.goTo(new edu.arizona.biosemantics.etcsite.client.content.matrixGeneration.MatrixGenerationOutputPlace(result));
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable caught) {
            edu.arizona.biosemantics.etcsite.client.common.Alerter.failedToCompleteReview(caught);
            edu.arizona.biosemantics.etcsite.client.common.Alerter.stopLoading(box);
        }
    });
}