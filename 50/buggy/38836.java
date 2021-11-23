public void loadUserName(java.lang.String username) {
    this.username = username;
    clearContribution();
    com.github.javierugarte.ContributionsRequest contributionsRequest = new com.github.javierugarte.ContributionsRequest(getContext());
    contributionsRequest.setLastWeeks(lastWeeks);
    contributionsRequest.launchRequest(username, this);
}