@org.junit.Test
public void testRefreshBlobTable() throws java.lang.Exception {
    io.crate.analyze.RefreshTableAnalyzedStatement analysis = ((io.crate.analyze.RefreshTableAnalyzedStatement) (analyze("refresh table blob.blobs")));
    assertThat(analysis.tables().iterator().next().ident().name(), org.hamcrest.Matchers.is("blobs"));
}