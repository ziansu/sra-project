public void setDefaultKitDao() {
    uk.ac.bbsrc.tgac.miso.persistence.impl.HibernateKitDao dao = new uk.ac.bbsrc.tgac.miso.persistence.impl.HibernateKitDao();
    dao.setJdbcTemplate(jdbcTemplate);
    dao.setNoteDAO(noteDao);
    dao.setSecurityDAO(securityStore);
    setKitDao(dao);
}