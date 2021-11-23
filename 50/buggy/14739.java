public void setQueries(java.util.List<io.transwarp.generate.config.stmt.QueryConfig> queries) {
    for (io.transwarp.generate.config.stmt.QueryConfig query : queries) {
        this.queries.add(io.transwarp.generate.config.stmt.QueryConfig.deepCopy(query));
    }
}