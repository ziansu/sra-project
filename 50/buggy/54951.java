@java.lang.Override
public java.util.Optional<java.lang.Long> processResults(java.sql.ResultSet set) throws java.sql.SQLException {
    if (set.next()) {
        java.util.Optional.of(set.getLong(columnRegistered));
    }
    return java.util.Optional.empty();
}