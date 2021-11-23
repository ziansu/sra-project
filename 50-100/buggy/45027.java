@java.lang.Override
public Store.StoreBuilder create() {
    try (final database db = new database()) {
        final java.sql.ResultSet rs = db.selectTableQuery(StoreQueries.addStore(Name));
        while (rs.next()) {
            Id = rs.getInt("StoreId");
        } 
    } catch (java.lang.Exception ex) {
        read();
    } finally {
        return this;
    }
}