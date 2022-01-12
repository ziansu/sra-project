@java.lang.Override
public boolean createOrUpdateGame(de.htwg.se.tpn.model.GameFieldInterface game, java.lang.String id) {
    if ((findGame(id)) == null) {
        de.htwg.se.tpn.persistence.couchDb.CouchDbDao.db.create(copySaveGame(game, id));
        return true;
    }else {
        de.htwg.se.tpn.persistence.couchDb.CouchDbDao.db.update(copySaveGame(game, id));
    }
    return false;
}