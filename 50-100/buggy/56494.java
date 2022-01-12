public speedy.model.database.ITable getTable(java.lang.String name) {
    this.lock.lock();
    try {
        initDBMS();
        for (speedy.model.database.dbms.DBMSTable table : tables) {
            if (table.getName().equalsIgnoreCase(name.trim())) {
                return table;
            }
        }
        throw new java.lang.IllegalArgumentException(((("Unable to find table " + name) + " in database ") + (getName())));
    } finally {
        this.lock.unlock();
    }
}