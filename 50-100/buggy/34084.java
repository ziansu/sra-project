private double[] getTopKTopicProbArr(java.util.List<edu.virginia.cs.solr.model.Topic> topics, int tagSize, edu.virginia.cs.solr.repository.QuestionRepository repository) {
    double[] topicProb = new double[topics.size()];
    edu.virginia.cs.solr.model.Topic[] topKTopicsArr = topics.toArray(new edu.virginia.cs.solr.model.Topic[0]);
    for (int i = 0; i < (topics.size()); i++) {
        topicProb[i] = (this.co_occurrence(topKTopicsArr[i], repository)) / tagSize;
    }
    return topicProb;
}