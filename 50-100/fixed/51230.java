@java.lang.Override
public boolean ajoutStatut(int idUser, java.lang.String statut) {
    if ((statut.length()) == 0) {
        return false;
    }
    DAO.PersonnesEntity user = getPersonne(idUser);
    DAO.StatutsEntity newStatut = new DAO.StatutsEntity(statut, new java.util.Date());
    statutDAO.save(newStatut);
    return personnesDAO.ajoutStatut(user, newStatut);
}