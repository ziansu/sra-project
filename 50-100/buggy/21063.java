public nc.mairie.metier.poste.FicheMetier chercherFicheMetierAvecFichePoste(java.lang.Integer idFichePoste, boolean fmPrimaire) {
    java.lang.String sql = "SELECT FM.* FROM FICHE_METIER FM " + ("JOIN FM_FP ON FM_FP.ID_FICHE_METIER = FM.ID_FICHE_METIER " + "WHERE FM_FP.ID_FICHE_POSTE = ? AND FM_FP.FM_PRIMAIRE = ?");
    try {
        return jdbcTemplate.queryForObject(sql, new java.lang.Object[]{ idFichePoste , fmPrimaire }, new org.springframework.jdbc.core.BeanPropertyRowMapper(nc.mairie.metier.poste.FicheMetier.class));
    } catch (org.springframework.dao.EmptyResultDataAccessException ex) {
        return null;
    }
}