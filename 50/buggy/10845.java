@org.junit.After
public void closeActionDao() throws java.lang.Exception {
    closeDao();
    actionDao = null;
}