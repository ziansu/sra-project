@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<app.model.Evento> findEventsByPersonIdAndDate(java.lang.Long personId, java.util.Date data) {
    javax.persistence.Query query = entitymanager.createNamedQuery("Evento.findEventsByPersonIdAndDate", app.model.Evento.class).setParameter("personId", personId).setParameter("date", data);
    try {
        return ((java.util.List<app.model.Evento>) (query.getResultList()));
    } catch (javax.persistence.NoResultException e) {
        e.printStackTrace();
        return null;
    }
}