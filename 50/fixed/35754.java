@java.lang.Override
public projectx.persistence.entities.Category findByName(java.lang.String name) {
    return db.findCategoryByName(name);
}