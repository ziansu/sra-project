public com.mongodb.BasicDBObject query() {
    com.mongodb.BasicDBObject q = new com.mongodb.BasicDBObject();
    if ((elist.size()) > 0) {
        for (org.giiwa.core.bean.Helper.W.Entity e : elist) {
            _parse(e, q);
        }
        for (org.giiwa.core.bean.Helper.W e : wlist) {
            com.mongodb.BasicDBList list = new com.mongodb.BasicDBList();
            for (org.giiwa.core.bean.Helper.W.Entity e1 : e.elist) {
                list.add(_parse(e1, new com.mongodb.BasicDBObject()));
            }
            q.append("$or", list);
        }
    }
    return q;
}