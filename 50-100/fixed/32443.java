@java.lang.Override
public void representationDiff(final java.util.Set<il.ac.technion.ie.model.Record> source, final java.util.Set<il.ac.technion.ie.model.Record> other, il.ac.technion.ie.canopy.model.DuplicateReductionContext reductionContext) {
    java.util.Set<il.ac.technion.ie.model.Record> sourceCopy = new java.util.HashSet(source);
    java.util.Set<il.ac.technion.ie.model.Record> otherCopy = new java.util.HashSet(other);
    sourceCopy.removeAll(otherCopy);
    reductionContext.setRepresentationDiff(sourceCopy.size());
}