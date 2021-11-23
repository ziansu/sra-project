private void initAccountTestData() throws java.lang.Exception {
    accountSolrServer.add(createAccount("1111", "JOHN1", "Fred Jones"), 0);
    accountSolrServer.add(createAccount("2222", "JOHN2", "John Jillian"), 0);
    accountSolrServer.commit(true, true);
}