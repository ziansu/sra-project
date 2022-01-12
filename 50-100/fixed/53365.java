public static <K, V> void clearAndPutAll(final java.util.Map<? super K, ? super V> where, final java.util.Map<? extends K, ? extends V> fromWhere) throws java.lang.NullPointerException {
    if (where == fromWhere) {
        return ;
    }
    where.clear();
    if (!(de.xwic.appkit.core.util.CollectionUtil.isEmpty(fromWhere))) {
        where.putAll(fromWhere);
    }
}