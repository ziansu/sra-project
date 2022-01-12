private void initAccountTestData() throws java.lang.Exception {
    accountSolrServer.add(createAccount("1111", "JOHN1", "Fred Jones"), 0);
    accountSolrServer.add(createAccount("2222", "JOHN2", "John Jillian"), 0);
    accountSolrServer.add(createAccount("3333", "JOHN3", "Euan Jakes"), 0);
    accountSolrServer.add(createAccount("4444", "JOHN4", "Jim Smith"), 0);
    accountSolrServer.add(createAccount("5555", "JOHN4", "Dee Carter"), 0);
    accountSolrServer.commit(true, true);
}