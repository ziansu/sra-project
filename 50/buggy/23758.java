private java.lang.String posTagFromTree(edu.stanford.nlp.trees.Tree tree, caevo.SieveSentence sent, int index) {
    if (tree == null)
        tree = sent.getParseTree();
    
    java.lang.String pos = caevo.util.TreeOperator.indexToPOSTag(tree, index);
    return pos;
}