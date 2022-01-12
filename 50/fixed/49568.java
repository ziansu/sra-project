private void makeGithubSearchQuery() {
    java.net.URL githubSearchUrl = com.qualitykiosk.myapp.Networkutil.buildUrl("true", "false");
    new com.qualitykiosk.myapp.MainActivity.GithubQueryTask().execute(githubSearchUrl);
}