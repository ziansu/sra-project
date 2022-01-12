@java.lang.Override
public com.levserj.domain.Item updateItem(com.levserj.domain.Item item) {
    if (!(repository.exists(item.getId()))) {
        com.levserj.service.mysql.MySQLItemService.LOG.error("Item with id: {} doesn't exist", item.getId());
        throw new java.util.NoSuchElementException(((("No such item: " + (item.getId())) + "  ") + (item.getTitle())));
    }
    return repository.save(item);
}