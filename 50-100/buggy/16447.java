protected int getNewTopic(int documentIndex, int wordIndexInVocab, nlmt.topicmodels.HierarchicalLDAPath path) {
    pmfSampler.clear();
    for (int topicIndex = 0; topicIndex < (maxDepth); topicIndex++) {
        nlmt.topicmodels.HierarchicalLDANode node = path.getNode(topicIndex);
        double weight = getTopicWeight(documentIndex, wordIndexInVocab, node);
        pmfSampler.add(weight);
    }
    return pmfSampler.sample();
}