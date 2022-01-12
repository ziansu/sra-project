protected int getNewTopic(int documentIndex, int wordIndexInVocab, nlmt.topicmodels.HierarchicalLDAPath path) {
    pmfSampler.clear();
    for (int topicIndex = 0; topicIndex < (maxDepth); topicIndex++) {
        nlmt.topicmodels.HierarchicalLDANode node = path.getNode(topicIndex);
        if (node != null) {
            double weight = getTopicWeight(documentIndex, wordIndexInVocab, node);
            pmfSampler.add(weight);
        }else {
            pmfSampler.add(0.0);
        }
    }
    return pmfSampler.sample();
}