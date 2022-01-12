private void assertInserted(final org.mongodb.morphia.query.UpdateResults res) {
    org.junit.Assert.assertThat(res.getInsertedCount(), org.hamcrest.CoreMatchers.is(1));
    org.junit.Assert.assertThat(res.getUpdatedCount(), org.hamcrest.CoreMatchers.is(0));
    org.junit.Assert.assertThat(res.getUpdatedExisting(), org.hamcrest.CoreMatchers.is(false));
}