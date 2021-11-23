@java.lang.Override
public int count(final java.lang.String realm, final java.lang.String type) {
    return getService(org.apache.syncope.common.rest.api.service.AnyObjectService.class).list(type, new org.apache.syncope.common.rest.api.beans.AnyListQuery.Builder().realm(realm).page(1).size(1).build()).getTotalCount();
}