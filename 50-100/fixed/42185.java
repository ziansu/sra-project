@org.junit.Test
public void connectionMapGetTest() {
    com.hkamran.ai.Node a = new com.hkamran.ai.Node(null, com.hkamran.ai.Activations.sigmoid);
    com.hkamran.ai.Node b = new com.hkamran.ai.Node(null, com.hkamran.ai.Activations.sigmoid);
    com.hkamran.ai.Connection c1 = new com.hkamran.ai.Connection(a, b, 0.0);
    java.util.Set<com.hkamran.ai.Connection> set = new java.util.HashSet<com.hkamran.ai.Connection>();
    set.add(c1);
    org.junit.Assert.assertTrue(set.contains(c1));
}