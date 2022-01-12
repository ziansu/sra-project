public T addExtra(T... extras) {
    if (extras != null) {
        for (T extra : extras) {
            if (extra == null)
                continue;
            
            if ((this.extra) == null) {
                this.extra = new java.util.LinkedList<>();
            }
            this.extra.add(extra);
        }
    }
    return ((T) (this));
}