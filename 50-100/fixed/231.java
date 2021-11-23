private boolean isAnnotationFinished() {
    de.tudarmstadt.ukp.clarin.webanno.api.annotation.model.AnnotatorState state = getModelObject();
    if (state.getMode().equals(Mode.CURATION)) {
        return state.getDocument().getState().equals(SourceDocumentState.CURATION_FINISHED);
    }else {
        return repository.isAnnotationFinished(state.getDocument(), state.getUser());
    }
}