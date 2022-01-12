@java.lang.Override
public void voteGame(int voto, model.dao.concrete.Utente utente, model.dao.concrete.Gioco gioco) throws java.sql.SQLException {
    java.sql.Connection connection = model.database.DB.openConnection();
    java.sql.PreparedStatement ps = connection.prepareStatement(model.dao.concrete.UtenteDao.VOTE_GAME);
    ps.setInt(1, voto);
    ps.setInt(2, gioco.getId());
    ps.setInt(3, utente.getId());
    ps.executeUpdate();
    ps.close();
    connection.close();
}