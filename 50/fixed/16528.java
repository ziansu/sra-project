public void newSymbol(char sy) {
    com.himamis.retex.editor.share.meta.MetaCharacter meta = formula.getMetaModel().getSymbol(("" + sy));
    currentField.addArgument(currentOffset, new com.himamis.retex.editor.share.model.MathCharacter(meta));
    (currentOffset)++;
}