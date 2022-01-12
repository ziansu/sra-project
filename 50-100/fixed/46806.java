@org.junit.BeforeClass
public static void setUp() {
    com.articulate.sigma.nlg.NLGUtils.readKeywordMap(com.articulate.sigma.nlg.SigmaMockTestBase.KB_PATH);
    java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> hash = new java.util.HashMap<>();
    hash.put("drink", null);
    hash.put("drive", null);
    hash.put("eat", null);
    hash.put("give", null);
    hash.put("read", null);
    hash.put("go", null);
    com.articulate.sigma.nlg.SigmaMockTestBase.oldWordNetSynSetTable = WordNet.wn.verbSynsetHash;
    WordNet.wn.verbSynsetHash = hash;
}