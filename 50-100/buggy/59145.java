@java.lang.SuppressWarnings(value = { "UnusedDeclaration" , "EmptyTryBlock" })
@java.lang.Override
public void close() {
    closed = true;
    try (java.sql.ResultSet resultSet = this.resultSet;java.sql.Statement statement = this.statement;java.sql.Connection connection = this.connection) {
    } catch (java.sql.SQLException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}