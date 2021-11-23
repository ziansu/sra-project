@java.lang.Override
public mil.nga.giat.mage.sdk.datastore.user.Team create(mil.nga.giat.mage.sdk.datastore.user.Team pTeam) throws mil.nga.giat.mage.sdk.exceptions.TeamException {
    mil.nga.giat.mage.sdk.datastore.user.Team createdTeam = null;
    try {
        createdTeam = teamDao.createIfNotExists(pTeam);
    } catch (java.sql.SQLException sqle) {
        android.util.Log.e(mil.nga.giat.mage.sdk.datastore.user.TeamHelper.LOG_NAME, ("There was a problem creating team: " + pTeam), sqle);
        throw new mil.nga.giat.mage.sdk.exceptions.TeamException(("There was a problem creating team: " + pTeam), sqle);
    }
    return createdTeam;
}