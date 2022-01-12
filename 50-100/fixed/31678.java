private void assertInserted(final org.mongodb.morphia.query.UpdateResults res) {
    org.junit.Assert.assertThat(res.getInsertedCount(), is(1));
    org.junit.Assert.assertThat(res.getUpdatedCount(), is(0));
    org.junit.Assert.assertThat(res.getUpdatedExisting(), is(false));
}