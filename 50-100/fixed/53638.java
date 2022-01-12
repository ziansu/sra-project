public void calculateITScore(java.util.Set<edu.virginia.cs.solr.model.Topic> topics, int tagSize, edu.virginia.cs.solr.repository.QuestionRepository repository) {
    double[] topic_pro_arr = getTopKTopicProbArr(topics, tagSize, repository);
    this.score = ((tagDistinctCount) * (java.lang.Math.log(((tagRawCount) + 1)))) * (this.getTagEntropy(topic_pro_arr));
}