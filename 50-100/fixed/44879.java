protected edu.stanford.nlp.trees.Tree[] prune(edu.stanford.nlp.trees.Tree questionTree, edu.stanford.nlp.trees.Tree documentTree) {
    edu.stanford.nlp.trees.Tree[] t = new edu.stanford.nlp.trees.Tree[2];
    if ((this.pruner) != null) {
        t[1] = pruner.prune(documentTree);
    }else {
        t[1] = documentTree;
    }
    t[0] = questionTree;
    return t;
}