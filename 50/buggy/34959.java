@org.junit.Before
public void addNewUser() {
    dummyRow1 = getDummyRow(capstat.tests.UserFactory.createDummyUser1());
    capstat.tests.UserDatabaseFacadeTest.userdb.addUser(dummyRow1);
    dummyRow2 = getDummyRow(capstat.tests.UserFactory.createDummyUser2());
    capstat.tests.UserDatabaseFacadeTest.userdb.addUser(dummyRow2);
}