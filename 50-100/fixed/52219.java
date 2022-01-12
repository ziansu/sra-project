private com.ctrip.hermes.broker.dal.hermes.MessagePriority findLatestMessageOffset(com.ctrip.hermes.core.bo.Tpp tpp) {
    try {
        return m_msgDao.findLatestOffset(tpp.getTopic(), tpp.getPartition(), tpp.getPriorityInt(), com.ctrip.hermes.broker.dal.hermes.MessagePriorityEntity.READSET_OFFSET);
    } catch (java.lang.Exception e) {
        com.ctrip.hermes.broker.queue.storage.mysql.MySQLMessageQueueStorage.log.warn("Find latest message offset failed.{}", tpp);
        return null;
    }
}