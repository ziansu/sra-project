private void assertUpdated(final org.mongodb.morphia.query.UpdateResults res, final int count) {
    org.junit.Assert.assertThat(res.getInsertedCount(), is(0));
    org.junit.Assert.assertThat(res.getUpdatedCount(), is(count));
    org.junit.Assert.assertThat(res.getUpdatedExisting(), is(true));
}