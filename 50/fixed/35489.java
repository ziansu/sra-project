@After
public void finish() {
    db.DatabaseController.getInstance().deleteAll();
}