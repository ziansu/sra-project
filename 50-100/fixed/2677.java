public void setTestModel1(com.raizlabs.android.dbflow.test.structure.TestModel1 model1) {
    testModel1 = new com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer(com.raizlabs.android.dbflow.test.structure.TestModel1.class);
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
    map.put(TestModel1.Table.NAME, model1.name);
    testModel1.setData(map);
}