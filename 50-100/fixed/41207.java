public void storeBunch(org.cook_e.data.Bunch b) throws java.sql.SQLException {
    java.lang.Integer id = getBunchId(b);
    if (id == null) {
        id = (org.cook_e.data.StorageAccessor.bunch_counter)++;
        bunch_ids.put(b.getTitle(), id);
    }
    try {
        sqlite.storeBunch(b, ((int) (id)), recipe_ids);
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException(e);
    }
}