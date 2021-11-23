@java.lang.Override
public boolean update(java.lang.String id, java.lang.String json) {
    if ((com.ai.paas.ipaas.util.StringUtil.isBlank(id)) || (com.ai.paas.ipaas.util.StringUtil.isBlank(json)))
        return false;
    
    org.elasticsearch.action.update.UpdateResponse response = client.prepareUpdate(indexName, indexName, id).setRefresh(true).setConsistencyLevel(WriteConsistencyLevel.DEFAULT).setDoc(json).get();
    if (!(com.ai.paas.ipaas.util.StringUtil.isBlank(response.getId())))
        return true;
    else
        return false;
    
}