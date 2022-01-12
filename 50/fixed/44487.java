@java.lang.Override
public void insert(E entity) throws tk.itworks10.bookshelf.model.dao.DAODuplicateEntityException {
    this.setUniqueId(entity);
    if (entities.contains(entity)) {
        throw new tk.itworks10.bookshelf.model.dao.DAODuplicateEntityException();
    }
    entities.add(entity);
}