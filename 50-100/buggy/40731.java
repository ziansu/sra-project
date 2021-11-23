@org.junit.Test
public void testContainsSandhiedCombinationAbsoluteFinals() throws java.io.IOException {
    java.lang.System.out.println("test containsSandhiedCombination()");
    char[] buffer = "Darmaprsti".toCharArray();
    int bufferIdx = 6;
    java.lang.String sandhied = "p";
    boolean res = io.bdrc.lucene.sa.SkrtWordTokenizer.containsSandhiedCombination(buffer, bufferIdx, sandhied, 5);
    assertTrue(res);
}