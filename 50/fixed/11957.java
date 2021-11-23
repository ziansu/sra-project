public java.util.List getList() {
    synchronized(lock_) {
        refreshNoLocking();
        return readOnlyView_;
    }
}