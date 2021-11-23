public static it.unitn.nlpir.projectors.Projector getProjector(it.unitn.nlpir.tree.TreeBuilder treeBuilder, int pruneRay, it.unitn.nlpir.pruners.PruningRule pruningRule, it.unitn.nlpir.tree.ITreePostprocessor tp) {
    it.unitn.nlpir.nodematchers.NodeMatcher matcher = it.unitn.nlpir.projectors.Projectors.getHard2ParentMatcher();
    it.unitn.nlpir.pruners.ChunkTreePruner pruner = null;
    if (pruneRay > 0)
        pruner = new it.unitn.nlpir.pruners.ChunkTreePruner(pruningRule, pruneRay);
    
    return new it.unitn.nlpir.projectors.RelTreeProjector(treeBuilder, matcher, tp, pruner);
}