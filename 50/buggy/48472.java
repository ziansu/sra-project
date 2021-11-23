public org.dbflute.erflute.editor.model.diagram_contents.not_element.dictionary.TypeData getTypeData() {
    if ((this.getFirstReferredColumn()) != null) {
        return getFirstReferredColumn().getTypeData();
    }
    return this.word.getTypeData();
}