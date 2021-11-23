public void pushIndentation(int indentation, org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.IndentationType type) {
    if (indentation > 0) {
        org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.Indentation value = new org.elmlang.intellijplugin.manualParsing.IndentationTokenTypeRemapper.Indentation(indentation, this.indentations.size(), type);
        this.indentations.push(value);
    }
}