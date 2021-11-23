private static de.greenrobot.dao.query.QueryBuilder<com.vector.onetodo.db.gen.ToDo> filteredQuery() {
    return App.daoSession.getToDoDao().queryBuilder().orderAsc(Properties.Start_date);
}