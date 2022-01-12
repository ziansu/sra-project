public void train(java.util.List<cs224n.ling.Tree<java.lang.String>> trainTrees) {
    for (int i = 0; i < (trainTrees.size()); i++) {
        trainTrees.set(i, cs224n.assignment.TreeAnnotations.annotateTree(trainTrees.get(i)));
    }
    lexicon = new cs224n.assignment.Lexicon(trainTrees);
    grammar = new cs224n.assignment.Grammar(trainTrees);
}