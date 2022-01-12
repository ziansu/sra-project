@java.lang.Override
public com.levserj.domain.Item updateItem(com.levserj.domain.Item item) {
    if (!(repository.exists(item.getId()))) {
        com.levserj.service.mysql.MySQLItemService.LOG.error("Item with id: {} doesn't exist", item.getId());
        return null;
    }
    return repository.save(item);
}