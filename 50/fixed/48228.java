public boolean createService(@javax.validation.constraints.NotNull
org.lhedav.pp.business.model.service.Service aService, @javax.validation.constraints.NotNull
org.lhedav.pp.business.model.service.Item anItem) {
    em.persist(aService);
    em.persist(anItem);
    em.flush();
    return true;
}