@java.lang.Override
public boolean update(java.lang.String id, com.ai.paas.ipaas.search.common.JsonBuilder jsonBuilder) {
    if ((com.ai.paas.ipaas.util.StringUtil.isBlank(id)) || (null == jsonBuilder))
        return false;
    
    org.elasticsearch.action.update.UpdateResponse response = client.prepareUpdate(indexName, indexName, id).setRefresh(true).setConsistencyLevel(WriteConsistencyLevel.DEFAULT).setDoc(jsonBuilder.getBuilder()).setRefresh(true).get();
    if (!(com.ai.paas.ipaas.util.StringUtil.isBlank(response.getId())))
        return true;
    else
        return false;
    
}