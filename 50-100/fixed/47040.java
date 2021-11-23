@org.junit.Test
public void removeNotWatchedFromWishedSucceeded() throws java.beans.PropertyVetoException, java.io.IOException, java.sql.SQLException {
    listDao.addToWished(film, true, user.getId());
    listDao.removeFromWished(film, user.getId());
    org.junit.Assert.assertEquals(0, listDao.showOwnWished(user.getId()).size());
}