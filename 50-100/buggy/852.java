public <T> io.druid.query.QueryRunner<T> getQueryRunner(io.druid.query.Query<T> query) {
    io.druid.query.QueryRunnerFactory<T, io.druid.query.Query<T>> factory = this.conglomerate.findFactory(query);
    io.druid.query.QueryToolChest<T, io.druid.query.Query<T>> toolChest = factory.getToolchest();
    return new io.druid.query.FinalizeResultsQueryRunner<T>(plumber.getQueryRunner(query), toolChest);
}