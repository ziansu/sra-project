public static <E> void clearAndAddAll(final java.util.Collection<? super E> where, final java.util.Collection<? extends E> fromWhere) throws java.lang.NullPointerException {
    where.clear();
    if (!(de.xwic.appkit.core.util.CollectionUtil.isEmpty(fromWhere))) {
        where.addAll(fromWhere);
    }
}