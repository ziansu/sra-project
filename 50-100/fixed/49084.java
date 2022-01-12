@org.junit.runners.Parameterized.Parameters
public static java.util.Collection<java.lang.Object[]> generateParams() {
    final java.util.List<java.lang.Object[]> paramsSet = new java.util.ArrayList<>();
    paramsSet.add(org.basex.index.ValueIndexTest.paramSet(false, false));
    paramsSet.add(org.basex.index.ValueIndexTest.paramSet(true, false));
    paramsSet.add(org.basex.index.ValueIndexTest.paramSet(false, true));
    paramsSet.add(org.basex.index.ValueIndexTest.paramSet(true, true));
    return paramsSet;
}