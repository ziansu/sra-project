public void newCharacter(com.himamis.retex.editor.share.meta.MetaCharacter meta) {
    currentField.addArgument(currentOffset, new com.himamis.retex.editor.share.model.MathCharacter(formula, meta));
    (currentOffset)++;
}