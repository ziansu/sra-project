private void hasIdOtherTableTest() {
    com.github.moko256.twicalico.database.CachedIdListSQLiteOpenHelper helper2 = new com.github.moko256.twicalico.database.CachedIdListSQLiteOpenHelper(android.support.test.InstrumentationRegistry.getTargetContext(), 0, "testIdDatabase2");
    boolean[] result = helper2.hasIdsOtherTable(new long[]{ 100 , 105 });
    org.junit.Assert.assertTrue(result[0]);
    org.junit.Assert.assertFalse(result[1]);
}