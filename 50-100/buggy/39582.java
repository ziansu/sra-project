private void reindexUsers(java.lang.String index) throws de.mpg.imeji.exceptions.ImejiException {
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Indexing users...");
    de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer indexer = new de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer(index, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes.users, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ANALYSER, de.mpg.imeji.logic.search.elasticsearch.ElasticService.getClient());
    java.util.List<de.mpg.imeji.logic.vo.User> users = new de.mpg.imeji.logic.user.controller.UserBusinessController().retrieveAll();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info((("+++ " + (users.size())) + " users to index +++"));
    indexer.indexBatch(users);
    indexer.commit();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("...users reindexed!");
}