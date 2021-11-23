private void removeReplacementSpan(java.lang.Class<?> clazz, int start) {
    java.lang.Object replacementSpan = getAssignSpan(replaceMap.get(clazz).clazz, start, start);
    getEditableText().removeSpan(replacementSpan);
    getEditableText().delete((start - 1), start);
    replaceMap.get(clazz).position = -1;
}