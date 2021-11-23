public java.lang.StringBuilder append(char c) {
    synchronized(this) {
        int newcount = (count) + 1;
        if (newcount > (value.length)) {
            expandCapacity(newcount);
        }
        value[((count)++)] = c;
        return this;
    }
}