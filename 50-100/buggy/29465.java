private void hasIdOtherTableTest() {
    com.github.moko256.twicalico.database.CachedIdListSQLiteOpenHelper helper2 = new com.github.moko256.twicalico.database.CachedIdListSQLiteOpenHelper(android.support.test.InstrumentationRegistry.getTargetContext(), 0, "testIdDatabase2");
    org.junit.Assert.assertTrue(helper2.hasIdOtherTable(2));
    org.junit.Assert.assertFalse(helper2.hasIdOtherTable(5));
    boolean[] result = helper2.hasIdsOtherTable(new long[]{ 100 , 105 });
    org.junit.Assert.assertTrue(result[0]);
    org.junit.Assert.assertFalse(result[1]);
}