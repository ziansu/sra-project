private void sendMessage(java.lang.String query) {
    updateDatabase(query, true, false);
    computeOtherMessage(query);
}