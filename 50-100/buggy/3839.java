public java.util.List<team_f.domain.entities.MusicalWork> getMusicalWorks() {
    javax.persistence.EntityManager session = getCurrentSession();
    javax.persistence.Query query = session.createQuery("from MusicalWorkEntity");
    java.util.List<team_f.database_wrapper.facade.MusicalWorkEntity> musicalWorkEntities = query.getResultList();
    java.util.List<team_f.domain.entities.MusicalWork> musicalWorks = new java.util.ArrayList<>();
    for (team_f.database_wrapper.facade.MusicalWorkEntity entity : musicalWorkEntities) {
        team_f.domain.entities.MusicalWork musicalWork = new team_f.domain.entities.MusicalWork();
        musicalWork = convertToMusicalWork(entity);
        musicalWorks.add(musicalWork);
    }
    return musicalWorks;
}