@java.lang.Override
public java.util.List<cz.muni.fi.pa165.travelagency.persistence.entity.Excursion> findByDuration(java.util.Date dateFrom, java.util.Date dateTo) {
    if (dateFrom == null)
        throw new java.lang.NullPointerException("Parameter dateFrom cannot be null.");
    
    if (dateTo == null)
        throw new java.lang.NullPointerException("Parameter dateTo cannot be null.");
    
    if ((dateTo.getTime()) > (dateFrom.getTime()))
        throw new java.lang.IllegalArgumentException("Argument DateTo must be after DateFrom.");
    
    return java.util.Collections.unmodifiableList(em.createQuery("SELECT e FROM Excursion e WHERE e.duration >= :dateFrom AND e.duration <= :dateTo", cz.muni.fi.pa165.travelagency.persistence.entity.Excursion.class).setParameter("dateFrom", dateFrom).setParameter("dateTo", dateTo).getResultList());
}