public es.upm.miw.apaw.user.api.entities.Sport getSport(java.lang.Long id) {
    assert id != null;
    return sports.get(id);
}