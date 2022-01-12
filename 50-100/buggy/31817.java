@org.junit.Test
public void shouldBuildInstancesSimple() {
    weka.core.Instances inst = null;
    ij.measure.ResultsTable rt_test = new ij.measure.ResultsTable();
    rt_test.showRowNumbers(false);
    rt_test.incrementCounter();
    rt_test.addValue("Heading1", 0.1);
    rt_test.addValue("Heading2", 0.5786574839);
    net.larla.leafy.common.LeafClassifier lc = new net.larla.leafy.common.LeafClassifier();
    try {
        inst = lc.buildInstances(rt_test);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    org.junit.Assert.assertNotNull(inst);
}