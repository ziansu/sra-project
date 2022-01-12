public static models.PagedList<models.Computer> page(int page, int pageSize, java.lang.String sortBy, java.lang.String order, java.lang.String filter) {
    return models.Computer.find.where().ilike("name", (("%" + filter) + "%")).orderBy(((sortBy + " ") + order)).fetch("company").setFirstRow((page * pageSize)).setMaxRows(pageSize).findPagedList();
}