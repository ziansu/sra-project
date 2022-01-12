public static org.apache.accumulo.core.client.IteratorSetting combinerSetting(int priority, java.util.List<org.apache.accumulo.core.client.IteratorSetting.Column> columns, edu.mit.ll.graphulo.simplemult.MathTwoScalar.ScalarOp op, edu.mit.ll.graphulo.simplemult.MathTwoScalar.ScalarType type, boolean keepZero) {
    org.apache.accumulo.core.client.IteratorSetting itset = new org.apache.accumulo.core.client.IteratorSetting(priority, edu.mit.ll.graphulo.simplemult.MathTwoScalar.class);
    if ((columns == null) || (columns.isEmpty()))
        org.apache.accumulo.core.iterators.Combiner.setCombineAllColumns(itset, true);
    else
        org.apache.accumulo.core.iterators.Combiner.setColumns(itset, columns);
    
    itset.addOptions(edu.mit.ll.graphulo.simplemult.MathTwoScalar.optionMap(op, type, null, false));
    return itset;
}