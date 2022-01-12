@java.lang.Override
public int compare(db.juhaku.juhakudb.core.schema.Schema lhs, db.juhaku.juhakudb.core.schema.Schema rhs) {
    if ((lhs == null) || ((lhs != null) && ((lhs.order) == null))) {
        return -1;
    }
    if ((rhs == null) || ((rhs != null) && ((rhs.order) == null))) {
        return 1;
    }
    return lhs.order.compareTo(rhs.order);
}