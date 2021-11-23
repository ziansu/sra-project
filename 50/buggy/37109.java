@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((newState) != 0) {
        stateDao.deleteState(newState);
    }
    if ((newClient) != 0) {
        clientDao.deleteClient(newClient);
    }
}