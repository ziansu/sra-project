private static java.util.Map<java.lang.Integer, edu.stanford.nlp.hcoref.data.CorefChain> makeCorefOutput(edu.stanford.nlp.hcoref.data.Document document) {
    java.util.Map<java.lang.Integer, edu.stanford.nlp.hcoref.data.CorefChain> result = edu.stanford.nlp.util.Generics.newHashMap();
    for (edu.stanford.nlp.hcoref.data.CorefCluster c : document.corefClusters.values()) {
        result.put(c.clusterID, new edu.stanford.nlp.hcoref.data.CorefChain(c, document.positions));
    }
    return result;
}