private void advanceScorer() throws java.io.IOException {
    while ((nextReader) < (leaves.size())) {
        leaf = leaves.get(((nextReader)++));
        scorer = weight.scorer(leaf, leaf.reader().getLiveDocs());
        if ((scorer) != null) {
            return ;
        }
    } 
    scorer = null;
}