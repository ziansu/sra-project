@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML })
@org.springframework.transaction.annotation.Transactional
public org.opennms.netmgt.model.OnmsAlarmCollection getAlarms() {
    readLock();
    try {
        final org.opennms.core.criteria.CriteriaBuilder builder = getCriteriaBuilder(m_uriInfo.getQueryParameters(), false);
        builder.distinct();
        final org.opennms.netmgt.model.OnmsAlarmCollection coll = new org.opennms.netmgt.model.OnmsAlarmCollection(m_alarmDao.findMatching(builder.toCriteria()));
        coll.setTotalCount(m_alarmDao.countMatching(builder.clearOrder().limit(0).offset(0).toCriteria()));
        return coll;
    } finally {
        readUnlock();
    }
}