@After
public void finish() {
    for (java.lang.Integer tmp : exampleTreasuresID) {
        db.DatabaseController.getInstance().deactivateTreasure(tmp);
    }
    db.DatabaseController.getInstance().deleteAll();
}