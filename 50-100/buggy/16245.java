public boolean isDuplicateName(java.lang.String name) {
    java.util.List<entity.Customer> customerList = this.customerDao.findByName(name);
    if ((customerList != null) || (!(customerList.isEmpty()))) {
        return true;
    }
    return false;
}