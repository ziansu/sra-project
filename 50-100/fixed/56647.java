public java.lang.String getStringQuery() {
    java.lang.String queryResult = "";
    java.lang.String select = "select ";
    java.lang.String from = "from Attendance a, ";
    java.lang.String where = "where ";
    java.lang.String group = "group by ";
    select += generateSelect();
    select += ", sum(a.attendance_count) ";
    from += generateFrom();
    group += generateGroupBy();
    where += generateWhere();
    where += generateSlice();
    queryResult = ((select + from) + where) + group;
    return queryResult;
}