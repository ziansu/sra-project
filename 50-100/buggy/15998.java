private void topicInferenceForNewItems() {
    java.lang.String name = "lda";
    org.plista.kornakapi.core.config.LDARecommenderConfig conf = ((org.plista.kornakapi.core.config.LDARecommenderConfig) (this.getConfiguration().getLDARecommender()));
    org.apache.hadoop.fs.Path p = new org.apache.hadoop.fs.Path(conf.getLDARecommenderModelPath());
    org.plista.kornakapi.core.training.DocumentTopicInferenceTrainer trainer = new org.plista.kornakapi.core.training.DocumentTopicInferenceTrainer(conf, p);
    this.setTrainer(name, trainer);
    scheduler().addRecommenderTrainingJob(name);
    try {
        scheduler().immediatelyTrainRecommender(name);
    } catch (org.quartz.SchedulerException e) {
        e.printStackTrace();
    }
}