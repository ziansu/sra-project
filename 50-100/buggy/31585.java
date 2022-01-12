private void reindexAlbums(java.lang.String index) throws de.mpg.imeji.exceptions.ImejiException {
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Indexing Albums...");
    de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer indexer = new de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer(index, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes.albums, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ANALYSER, de.mpg.imeji.logic.search.elasticsearch.ElasticService.getClient());
    de.mpg.imeji.logic.controller.resource.AlbumController controller = new de.mpg.imeji.logic.controller.resource.AlbumController();
    java.util.List<de.mpg.imeji.logic.vo.Album> albums = controller.retrieveAll(Imeji.adminUser);
    indexer.indexBatch(albums);
    indexer.commit();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Albums reindexed!");
}