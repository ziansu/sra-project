@java.lang.Override
public void run() {
    com.yahoo.squidb.test.TestModel model = new com.yahoo.squidb.test.TestModel();
    java.util.List<java.lang.String> numbers = java.util.Arrays.asList("0", "1", "2", "3");
    model.setSomeList(numbers);
    database.persist(model);
    model = database.fetch(com.yahoo.squidb.test.TestModel.class, model.getRowId(), TestModel.PROPERTIES);
    assertEquals(numbers, model.getSomeList());
    assertEquals(numbers, model.getSomeList());
}