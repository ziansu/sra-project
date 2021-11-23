public <T> T execute(uk.ac.diamond.ispyb.test.IntegrationTestHelper.CheckedFunction<T, S> f) throws java.io.IOException, java.sql.SQLException {
    uk.ac.diamond.ispyb.api.ConnectionData data = new uk.ac.diamond.ispyb.api.ConnectionData();
    S api = factory.buildIspybApi(data.getUrl(), data.getUser(), data.getPassword(), java.util.Optional.of(data.getSchema()));
    T result = f.apply(api);
    api.close();
    return result;
}