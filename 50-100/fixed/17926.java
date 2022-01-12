@java.lang.Override
public void onSuccess(java.lang.Boolean warnUser) {
    if (warnUser) {
        final com.sencha.gxt.widget.core.client.box.MessageBox box = edu.arizona.biosemantics.etcsite.client.common.Alerter.semanticMarkupWarnUserTooManyWords();
        box.getButton(PredefinedButton.YES).addSelectHandler(new com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler() {
            @java.lang.Override
            public void onSelect(com.sencha.gxt.widget.core.client.event.SelectEvent event) {
                startSemanticMarkup();
            }
        });
    }else {
        startSemanticMarkup();
    }
}