public void index(java.lang.String repo, java.lang.String url, java.util.UUID datasetKey) throws java.io.IOException, java.sql.SQLException {
    this.datasetKey = datasetKey;
    init(repo);
    download(url);
    normalize();
    sync();
}