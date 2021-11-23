public dbGenerator.NormElement getNormElement(java.lang.String origKey) {
    for (dbGenerator.NormElement el : normElements.values()) {
        if (el.sourceTagNames.contains(origKey)) {
            return el;
        }
    }
    return null;
}