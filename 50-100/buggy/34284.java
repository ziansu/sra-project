public void updateIndexAfterVocabularyEvent(fi.csc.termed.search.domain.Notification notification) {
    java.lang.String vocabularyId = notification.getBody().getNode().getType().getGraph().getId();
    if (vocabularyId != null) {
        deleteDocumentsFromIndexByVocabularyId(vocabularyId);
        switch (notification.getType()) {
            case NodeSavedEvent :
                indexListOfConceptsInVocabulary(vocabularyId);
                break;
        }
    }else {
        log.error("Unable to update index after vocabulary event");
    }
}