@java.lang.Override
public Store.StoreBuilder update(boolean justFlipListActive) {
    try {
        try (final database db = new database()) {
            if ((Name) != null) {
                if ((Id) != 0) {
                    db.updateTableQuery(StoreQueries.updateStore(this.build()));
                }else {
                    throw new java.sql.SQLException();
                }
            }
        } catch (java.lang.Exception ex) {
            throw ex;
        }
    } catch (java.lang.Exception ex) {
        create();
    } finally {
        return this;
    }
}