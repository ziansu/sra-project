@org.springframework.scheduling.annotation.Scheduled(cron = "00 30 23 * * ?")
public void indexApps() throws java.lang.Exception {
    com.ehi.bo.util.ScheduleTask.logger.info("*********Begin indexing individual apps.********");
    com.ehi.bo.lucene.Indexer indexer = new com.ehi.bo.lucene.Indexer();
    indexer.deleteAllIndex();
    int docNum = indexer.indexAll();
    indexer.close();
    com.ehi.bo.util.ScheduleTask.logger.info(("Total index: " + docNum));
    com.ehi.bo.util.ScheduleTask.logger.info("*********End indexing individual apps.**********");
    searcher.reload();
}