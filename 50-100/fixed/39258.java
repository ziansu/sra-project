private static java.lang.String treeAsStemmedCollocation(edu.stanford.nlp.trees.Tree t) {
    java.util.List<edu.stanford.nlp.ling.WordTag> list = edu.stanford.nlp.trees.CollocationFinder.getStemmedWordTagsFromTree(t);
    java.lang.StringBuilder s = new java.lang.StringBuilder(160);
    edu.stanford.nlp.ling.WordTag firstWord = list.remove(0);
    s.append(firstWord.word());
    for (edu.stanford.nlp.ling.WordTag wt : list) {
        s.append("_");
        s.append(wt.word());
    }
    return s.toString();
}