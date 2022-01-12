private static java.util.List<edu.stanford.nlp.ling.WordTag> getStemmedWordTagsFromTree(edu.stanford.nlp.trees.Tree t) {
    java.util.List<edu.stanford.nlp.ling.WordTag> stemmedWordTags = edu.stanford.nlp.util.Generics.newArrayList();
    java.util.ArrayList<edu.stanford.nlp.ling.TaggedWord> s = t.taggedYield();
    for (edu.stanford.nlp.ling.TaggedWord w : s) {
        edu.stanford.nlp.ling.WordTag wt = edu.stanford.nlp.process.Morphology.stemStatic(w.word(), w.tag());
        stemmedWordTags.add(wt);
    }
    return stemmedWordTags;
}