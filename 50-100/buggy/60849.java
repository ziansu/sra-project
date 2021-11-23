@org.junit.Test
public void testMapRemovalByObjectPollLoop() throws java.lang.Exception {
    this.map.add(ca);
    this.map.add(bc);
    this.map.add(ab);
    org.junit.Assert.assertTrue(this.map.remove(ab));
    com.apporiented.algorithm.clustering.ClusterPair removeFirst = this.map.removeFirst();
    org.junit.Assert.assertEquals(bc, removeFirst);
}