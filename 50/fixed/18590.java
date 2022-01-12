public java.util.List<edu.pitt.dbmi.ccd.db.entity.JobQueueInfo> findByStatus(int status) {
    return jobQueueInfoRepository.findByStatus(status);
}