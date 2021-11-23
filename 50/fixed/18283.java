private boolean validateEvent(caevo.TextEvent event, edu.stanford.nlp.trees.Tree tree, caevo.SieveSentence sent) {
    java.lang.String eventPos = posTagFromTree(tree, sent, event.getIndex());
    return eventPos.startsWith("VB");
}