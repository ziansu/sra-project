@java.lang.Override
public java.util.Iterator<com.day.cq.wcm.api.Page> listChildren(com.day.cq.commons.Filter<com.day.cq.wcm.api.Page> pageFilter) {
    return new com.twcable.jackalope.impl.cq.PageIteratorImpl(resource, pageFilter);
}