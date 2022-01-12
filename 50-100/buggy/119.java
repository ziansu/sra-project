@java.lang.Override
public void run() {
    com.yahoo.squidb.test.TestModel model = new com.yahoo.squidb.test.TestModel();
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>> crazyMap = mockComplicatedMap();
    model.setComplicatedMap(crazyMap);
    database.persist(model);
    model = database.fetch(com.yahoo.squidb.test.TestModel.class, model.getRowId(), TestModel.PROPERTIES);
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>> readMap = model.getComplicatedMap();
    assertEquals(crazyMap, readMap);
}