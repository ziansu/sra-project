public void newArray(int size) {
    com.himamis.retex.editor.share.meta.MetaArray meta = formula.getMetaModel().getArray();
    com.himamis.retex.editor.share.model.MathArray array = new com.himamis.retex.editor.share.model.MathArray(formula, meta, size);
    currentField.addArgument(currentOffset, array);
    com.himamis.retex.editor.share.model.MathSequence field = new com.himamis.retex.editor.share.model.MathSequence(formula);
    array.setArgument(0, field);
    for (int i = 1; i < size; i++) {
        array.setArgument(i, new com.himamis.retex.editor.share.model.MathSequence(formula));
    }
    currentField = field;
    currentOffset = 0;
}