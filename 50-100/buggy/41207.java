public void storeBunch(org.cook_e.data.Bunch b) throws java.sql.SQLException {
    java.lang.Integer id = getBunchId(b);
    if (id == null)
        bunch_ids.put(b.getTitle(), ((org.cook_e.data.StorageAccessor.bunch_counter)++));
    
    try {
        sqlite.storeBunch(b, ((int) (id)), recipe_ids);
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException(e);
    }
}