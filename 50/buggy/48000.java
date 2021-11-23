public void newOperator(char op) {
    com.himamis.retex.editor.share.meta.MetaCharacter meta = formula.getMetaModel().getOperator(("" + op));
    currentField.addArgument(currentOffset, new com.himamis.retex.editor.share.model.MathCharacter(formula, meta));
    (currentOffset)++;
}