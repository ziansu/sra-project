@java.lang.Override
public void onSuccess(java.lang.String result) {
    if (result.equals("valid")) {
        placeController.goTo(new edu.arizona.biosemantics.etcsite.client.content.semanticMarkup.SemanticMarkupInputPlace());
        edu.arizona.biosemantics.etcsite.client.common.Alerter.stopLoading(box);
    }else {
        edu.arizona.biosemantics.etcsite.client.common.Alerter.inputError(result);
        edu.arizona.biosemantics.etcsite.client.common.Alerter.stopLoading(box);
    }
}