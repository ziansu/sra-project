@java.lang.Override
public projectx.persistence.entities.Category findByid(long id) {
    return db.findCategoryById(id);
}