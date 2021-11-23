@org.junit.Test
public void logicalAnd() {
    org.eclipse.january.dataset.BooleanDataset bs = org.eclipse.january.dataset.Comparisons.logicalAnd(a, b);
    java.lang.System.out.println(("Result of a && b " + bs));
    final org.eclipse.january.dataset.IDataset booleans = org.eclipse.january.dataset.DatasetFactory.zeros(org.eclipse.january.dataset.BooleanDataset.class, 2, 3);
    booleans.set(true, 0, 0);
    booleans.set(true, 1, 1);
    booleans.set(true, 1, 2);
    final org.eclipse.january.dataset.IDataset and = org.eclipse.january.dataset.Maths.multiply(a, booleans);
    java.lang.System.out.println(("Keeping some values using a boolean mask " + and));
}