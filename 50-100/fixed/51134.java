public java.lang.Boolean isMatching(java.lang.Object element) {
    if (!(element instanceof de.jcup.egradle.core.model.Item)) {
        return java.lang.Boolean.FALSE;
    }
    de.jcup.egradle.core.model.Item item = ((de.jcup.egradle.core.model.Item) (element));
    if (matcher.matches(item)) {
        return java.lang.Boolean.TRUE;
    }
    return null;
}