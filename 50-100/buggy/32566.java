public static org.elasticsearch.common.xcontent.XContentBuilder marshall(io.apiman.manager.api.es.beans.ApiDefinitionBean bean) throws io.apiman.manager.api.core.exceptions.StorageException {
    try {
        io.apiman.manager.api.es.EsMarshalling.preMarshall(bean);
        org.elasticsearch.common.xcontent.XContentBuilder builder = org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder().startObject().field("data", bean.getData()).endObject();
        io.apiman.manager.api.es.EsMarshalling.postMarshall(bean);
        return builder;
    } catch (java.io.IOException e) {
        throw new io.apiman.manager.api.core.exceptions.StorageException(e);
    }
}