private static boolean isJoolTuple(java.lang.Class<?> clazz) {
    while (clazz != null) {
        for (java.lang.Class<?> i : clazz.getInterfaces()) {
            if ("org.jooq.lambda.tuple.Tuple".equals(i.getName())) {
                return true;
            }
        }
        clazz = clazz.getSuperclass();
    } 
    return false;
}