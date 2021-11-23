@java.lang.Override
public java.util.List<com.netcracker.model.entity.Person> getManagers(com.netcracker.repository.common.Pageable pageable, java.lang.String namePattern) {
    return super.queryForList(FIND_MANAGER_NAME_PATTERN, pageable, namePattern);
}