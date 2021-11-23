public java.lang.Boolean isMatching(java.lang.Object element) {
    if (!(element instanceof de.jcup.egradle.core.model.Item)) {
        return java.lang.Boolean.FALSE;
    }
    de.jcup.egradle.core.model.Item item = ((de.jcup.egradle.core.model.Item) (element));
    java.lang.String matchName = item.getName();
    matchName = org.eclipse.osgi.util.TextProcessor.deprocess(matchName);
    if ((matchName != null) && (matcher.matches(matchName))) {
        return java.lang.Boolean.TRUE;
    }
    return null;
}