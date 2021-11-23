@java.lang.Override
public grupog.agendamlg.entities.Evento getEventById(java.lang.String event) {
    javax.persistence.TypedQuery<grupog.agendamlg.entities.Evento> query = em.createNamedQuery("getEventById", grupog.agendamlg.entities.Evento.class).setParameter("evento", java.lang.Long.parseLong(event));
    return query.getSingleResult();
}