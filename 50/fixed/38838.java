public java.util.List<galvanize.entity.DateEvent> findDateEventsByType(java.lang.Long dateEventTypeId) {
    return em.createQuery("from DateEvent de where de.dateEventType.id = ? order by de.eventDate desc", galvanize.entity.DateEvent.class).setParameter(1, dateEventTypeId).getResultList();
}