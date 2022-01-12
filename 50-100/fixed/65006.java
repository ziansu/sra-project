private void syncTopicToTarget(com.ctrip.hermes.core.bo.TopicView topic, javax.ws.rs.client.WebTarget target) {
    java.util.Set<java.lang.String> missedDatasources = getMissedDatasourceOnTarget(topic, target);
    if ((missedDatasources.size()) == 0) {
        switch (topic.getStorageType()) {
            case com.ctrip.hermes.meta.entity.Storage.MYSQL :
                syncMysqlTopic(topic, target);
                break;
            case com.ctrip.hermes.meta.entity.Storage.KAFKA :
                syncKafkaTopic(topic, target);
                break;
        }
    }else {
        throw new com.ctrip.hermes.portal.resource.assists.RestException(("Target has missed datasources, pls init them: " + missedDatasources));
    }
}