@java.lang.Override
public nc.mairie.metier.poste.FicheMetier chercherFicheMetierAvecFichePoste(nc.mairie.metier.poste.FMFP lien) {
    java.lang.String sql = ((("SELECT * FROM " + (NOM_TABLE)) + " WHERE ") + (nc.mairie.spring.dao.metier.poste.FicheMetierDao.CHAMP_ID_FICHE_METIER)) + " = ?";
    try {
        return jdbcTemplate.queryForObject(sql, new java.lang.Object[]{ lien.getIdFicheMetier() }, new org.springframework.jdbc.core.BeanPropertyRowMapper(nc.mairie.metier.poste.FicheMetier.class));
    } catch (org.springframework.dao.EmptyResultDataAccessException ex) {
        return null;
    } catch (java.lang.NullPointerException ex) {
        return null;
    }
}