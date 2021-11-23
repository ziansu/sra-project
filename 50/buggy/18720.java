private void assertMaxSizeEquals(int exp) {
    assertEquals(exp, org.apache.ignite.testframework.GridTestUtils.getFieldValue(org.apache.ignite.internal.processors.query.IgniteSqlMergeQueryInvalidParametersTest.h2Idx, org.apache.ignite.internal.processors.query.h2.IgniteH2Indexing.class, "sqlMergeTblMaxSize"));
}