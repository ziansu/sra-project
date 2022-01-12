public boolean isDuplicateName(int id, java.lang.String name) {
    java.util.List<entity.Customer> customerList = this.customerDao.findByName(name);
    if ((!(customerList.isEmpty())) && ((customerList.get(0).getId()) != id)) {
        return true;
    }
    return false;
}