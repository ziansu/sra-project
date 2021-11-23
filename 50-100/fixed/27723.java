private java.lang.String tranform(java.lang.String id) {
    java.lang.String id_prefix = id.substring(0, 6);
    java.lang.String birth_year = id.substring(6, 10);
    java.lang.String birth_month_days = id.substring(10, 14);
    return (((((("/" + id_prefix) + "/") + birth_year) + "/") + birth_month_days) + "/") + (id.substring(14));
}