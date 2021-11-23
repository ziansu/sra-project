@org.junit.Test
public void testDeleteIndex() throws java.lang.Exception {
    org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse indicesExistsResponse = indicesAdminClient.prepareExists("priceinfo").get();
    java.lang.System.out.println(indicesExistsResponse.isExists());
    if (indicesExistsResponse.isExists()) {
        org.elasticsearch.action.admin.indices.delete.DeleteIndexResponse deleteIndexResponse = indicesAdminClient.prepareDelete("priceinfo").get();
        java.lang.System.out.println(("isAcknowledged = " + (deleteIndexResponse.isAcknowledged())));
    }
}