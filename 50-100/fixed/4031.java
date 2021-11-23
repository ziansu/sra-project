private long getMapPageSize() {
    long pageSize = (ff.getPageSize()) * (ff.getPageSize());
    if ((pageSize < (ff.getPageSize())) || (pageSize > (com.questdb.cairo.TableWriter._16M))) {
        if (((com.questdb.cairo.TableWriter._16M) % (ff.getPageSize())) == 0) {
            return com.questdb.cairo.TableWriter._16M;
        }
        return ff.getPageSize();
    }else {
        return pageSize;
    }
}