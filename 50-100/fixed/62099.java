@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML })
@org.springframework.transaction.annotation.Transactional
public org.opennms.netmgt.model.OnmsEventCollection getEvents() throws java.text.ParseException {
    readLock();
    try {
        final org.opennms.core.criteria.CriteriaBuilder builder = getCriteriaBuilder(m_uriInfo.getQueryParameters());
        builder.orderBy("eventTime").asc();
        final org.opennms.netmgt.model.OnmsEventCollection coll = new org.opennms.netmgt.model.OnmsEventCollection(m_eventDao.findMatching(builder.toCriteria()));
        coll.setTotalCount(m_eventDao.countMatching(builder.count().toCriteria()));
        return coll;
    } finally {
        readUnlock();
    }
}