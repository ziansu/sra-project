@org.junit.BeforeClass
public static void setUp() {
    com.articulate.sigma.nlg.NLGUtils.readKeywordMap(com.articulate.sigma.nlg.SigmaMockTestBase.KB_PATH);
    java.util.Hashtable<java.lang.String, java.lang.String> hash = new java.util.Hashtable<>();
    hash.put("drink", "");
    hash.put("drive", "");
    hash.put("eat", "");
    hash.put("give", "");
    hash.put("read", "");
    hash.put("go", "");
    com.articulate.sigma.nlg.SigmaMockTestBase.oldWordNetSynSetTable = WordNet.wn.verbSynsetHash;
    WordNet.wn.verbSynsetHash = hash;
}