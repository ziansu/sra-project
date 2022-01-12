public sampling.likelihood.DirMult getTopicWord(int[] path) {
    sampler.unsupervised.RecursiveLDA.RLDA node = rootLDA;
    for (int ll = 1; ll < (path.length); ll++) {
        node = node.getChild(path[(ll - 1)]);
    }
    return node.getTopicWords()[path[((path.length) - 1)]];
}