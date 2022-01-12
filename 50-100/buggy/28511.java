@org.junit.Test
public void evaluateTrivialOneTest() {
    tree.Tree tree = new tree.Tree(1, true);
    master.CopyOfObjectEvaluate object = new master.CopyOfObjectEvaluate(tree);
    java.lang.Double[] d = new java.lang.Double[3];
    d[0] = 1.0;
    d[1] = 3.0;
    d[2] = 3.0;
    object.examples.add(d);
    org.junit.Assert.assertEquals(2, object.evaluateTrivialOne().size());
}