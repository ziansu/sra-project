public void init(T t) {
    for (java.lang.reflect.Field field : fields) {
        whereCondition += (field.getAnnotation(com.epam.gm.olgmaks.absractdao.annotation.Column.class).value()) + "=? AND ";
    }
    whereCondition = whereCondition.substring(0, ((whereCondition.length()) - 4));
    java.lang.System.out.println(("whereCondition : " + (whereCondition)));
}