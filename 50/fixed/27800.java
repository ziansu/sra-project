public dbGenerator.NormElement getNormElement(java.lang.String origKey) {
    for (dbGenerator.NormElement el : normElements.values()) {
        if (el.sourceTagNames.contains(((java.lang.CharSequence) (origKey)))) {
            return el;
        }
    }
    return null;
}