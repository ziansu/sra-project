public com.querydslext.core.service.Query<T> or(com.querydslext.core.support.Or or) {
    if ((where) != null) {
        where = where.and(or.getWhere());
    }else {
        where = or.getWhere();
    }
    return this;
}