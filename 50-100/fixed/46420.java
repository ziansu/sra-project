public boolean deleteEntityFromElastic(java.lang.String entityId, java.lang.String index) {
    if ((((entityId == null) || (entityId.isEmpty())) || (index == null)) || (index.isEmpty()))
        return false;
    
    this.bulkProcessor.add(new org.elasticsearch.action.delete.DeleteRequest(index, index, entityId));
    this.bulkProcessor.flush();
    return true;
}