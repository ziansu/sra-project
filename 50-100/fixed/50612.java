public static void testDouble() throws java.lang.Exception {
    TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull dn = new TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull(new java.lang.Double(1));
    TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull dd2 = new TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull(null);
    TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull[] dd = new TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull[]{ dn , dd2 };
    com.google.gson.Gson gson = TestGenerator.ArgumentCache.UniversalTypeAdapterFactory.buildGson(dd);
    java.lang.String json = gson.toJson(dd);
    TestGenerator.UnitTests.UniversalTypeAdapterFactoryTest.DoubleNull[] _dd = TestGenerator.ArgumentCache.UniversalTypeAdapterFactory.deserialize(json, dd.getClass(), gson);
}