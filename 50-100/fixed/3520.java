public static io.ddf.datasource.DataSourceDescriptor resolve(java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options) throws io.ddf.exception.DDFException, java.net.URISyntaxException {
    switch (source) {
        case "S3" :
            {
                return io.ddf.datasource.DataSourceResolver.resolveS3(options);
            }
        case "hdfs" :
            {
                return io.ddf.datasource.DataSourceResolver.resolveHDFS(options);
            }
        case "jdbc" :
            {
                return io.ddf.datasource.DataSourceResolver.resolveJDBC(options);
            }
        case "sql" :
            {
                return io.ddf.datasource.DataSourceResolver.resolveSQL(options);
            }
        default :
            {
                throw new io.ddf.exception.DDFException(("Error, could not find data-source for " + source));
            }
    }
}