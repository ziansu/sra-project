@org.junit.Before
public void prepareDao() {
    dao = new model.Contact.Dao();
    dao.setApp(app);
    dao.setDatastore(ds());
}