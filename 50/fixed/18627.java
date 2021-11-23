public void rcClear(java.lang.Exception e) {
    synchronized(this) {
        if ((this.rc) != null) {
            this.rc.clear(e);
        }
    }
}