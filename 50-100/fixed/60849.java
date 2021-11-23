@org.junit.Test
public void testMapRemovalByObjectPollLoop() throws java.lang.Exception {
    this.map.add(ca);
    this.map.add(bc);
    this.map.add(ab);
    assertTrue(this.map.remove(ab));
    com.apporiented.algorithm.clustering.ClusterPair removeFirst = this.map.removeFirst();
    assertEquals(bc, removeFirst);
}