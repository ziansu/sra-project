@org.springframework.scheduling.annotation.Scheduled(fixedRate = 60000 * 15, initialDelay = 60000 * 15)
public void addOrUpdateIndex() throws java.lang.Exception {
    com.ehi.bo.lucene.Indexer indexer = new com.ehi.bo.lucene.Indexer();
    int addNum = indexer.addIndex();
    com.ehi.bo.util.ScheduleTask.logger.info(("New Index: " + addNum));
    int updateNum = indexer.updateIndex();
    com.ehi.bo.util.ScheduleTask.logger.info(("Update Index: " + updateNum));
    indexer.close();
    searcher.reload();
}