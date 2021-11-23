private void assertUpdated(final org.mongodb.morphia.query.UpdateResults res, final int count) {
    org.junit.Assert.assertThat(res.getInsertedCount(), org.hamcrest.CoreMatchers.is(0));
    org.junit.Assert.assertThat(res.getUpdatedCount(), org.hamcrest.CoreMatchers.is(count));
    org.junit.Assert.assertThat(res.getUpdatedExisting(), org.hamcrest.CoreMatchers.is(true));
}