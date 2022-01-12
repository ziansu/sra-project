@java.lang.Override
public void create(T item) throws main.repository.exceptions.DatabaseException {
    if ((getDataMapper()) != null) {
        try {
            getDataMapper().insert(item);
        } catch (java.sql.SQLException e) {
            throw new main.repository.exceptions.DatabaseException(e);
        }
    }
    list.add(item);
}