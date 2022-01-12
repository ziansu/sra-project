@java.lang.SuppressWarnings(value = { "UnusedDeclaration" , "EmptyTryBlock" })
@java.lang.Override
public void close() {
    if (closed) {
        return ;
    }
    try (java.sql.Connection connection = this.connection;java.sql.Statement statement = this.statement;java.sql.ResultSet resultSet = this.resultSet) {
    } catch (java.sql.SQLException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
    closed = true;
}