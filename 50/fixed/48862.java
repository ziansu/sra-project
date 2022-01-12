@java.lang.Override
public void apply() {
    try {
        stmt.cancel();
    } catch (java.sql.SQLException e) {
        throw new org.apache.ignite.IgniteException("Failed to cancel the statement.", e);
    }
}