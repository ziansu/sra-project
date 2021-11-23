@java.lang.Override
public void onDocumentSelected(org.apache.wicket.ajax.AjaxRequestTarget aTarget) {
    actionLoadDocument(aTarget);
    try {
        editor.loadFeatureEditorModels(aTarget);
    } catch (de.tudarmstadt.ukp.clarin.webanno.api.annotation.exception.AnnotationException e) {
        error(("Error loading layers" + (e.getMessage())));
    }
}