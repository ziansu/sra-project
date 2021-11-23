public static io.confluent.connect.jdbc.source.JdbcSourceTaskConfig load(java.util.Map<java.lang.String, java.lang.String> props) {
    io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance = new io.confluent.connect.jdbc.source.JdbcSourceTaskConfig(props);
    return io.confluent.connect.jdbc.source.JdbcSourceTaskConfig.instance;
}