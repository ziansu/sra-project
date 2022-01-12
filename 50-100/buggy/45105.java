@org.junit.Test
public void testMapRemovalFront() throws java.lang.Exception {
    this.map.add(ca);
    this.map.add(bc);
    this.map.add(ab);
    com.apporiented.algorithm.clustering.ClusterPair removeFirst = this.map.removeFirst();
    org.junit.Assert.assertEquals(ab, removeFirst);
}