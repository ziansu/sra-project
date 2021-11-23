private void actionShowPreviousDocument(org.apache.wicket.ajax.AjaxRequestTarget aTarget) {
    de.tudarmstadt.ukp.clarin.webanno.api.annotation.model.AnnotatorState state = getModelObject();
    java.util.List<de.tudarmstadt.ukp.clarin.webanno.model.SourceDocument> listOfSourceDocuements = getListOfDocs();
    int currentDocumentIndex = listOfSourceDocuements.indexOf(state.getDocument());
    if (currentDocumentIndex == 0) {
        aTarget.appendJavaScript("alert('This is the first document!')");
        return ;
    }
    state.setDocument(listOfSourceDocuements.get((currentDocumentIndex - 1)));
    actionLoadDocument(aTarget);
}