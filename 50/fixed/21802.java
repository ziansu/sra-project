@java.lang.Override
public eu.europeana.corelib.definitions.edm.beans.FullBean findById(java.lang.String europeanaObjectId, boolean similarItems) {
    java.lang.System.err.println(("look up briefbean on " + europeanaObjectId));
    return new eu.europeana.corelib.solr.service.mock.bean.FullBeanMock(briefBeans.get(europeanaObjectId));
}