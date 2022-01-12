@org.junit.Test
public void updateTimeList() {
    TestJUnitDB.userDAO.createUser(new org.team8.webapp.User.User("dummy2", "dummy2", 1));
    TestJUnitDB.timeListDAO.createTimeList(new org.team8.webapp.TimeList.TimeList("dummy2", 1990, 0, 60, 0, 0));
    org.junit.Assert.assertTrue(TestJUnitDB.timeListDAO.updateTimeList(new org.team8.webapp.TimeList.TimeList("dummy2", 1990, 0, 65, 1, 1)));
    TestJUnitDB.timeListDAO.removeTimeList(1990, 0, "dummy");
    TestJUnitDB.userDAO.removeUser("dummy2");
}