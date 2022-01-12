@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    if (rankToRemove != null) {
        com.j256.ormlite.stmt.DeleteBuilder<johnnie.com.colourmemory.model.CMRank, java.lang.Long> deleteBuilder = rankDao.deleteBuilder();
        deleteBuilder.where().eq(CMRank.COLUMN_ID, rankToRemove.getInternalId());
        deleteBuilder.delete();
        rankDao.delete(rankToRemove);
        ranks.remove(rankToRemove);
    }
    rankDao.create(rank);
    ranks.add(rank);
    listener.onRankSaved();
    return true;
}