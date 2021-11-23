public java.util.Date getLastModified() {
    java.util.Date d = null;
    if (((lastModified) != null) && ((lastModifiedUsec) != null)) {
        long t = ((lastModified) * 1000L) + ((lastModifiedUsec) / 100L);
        d = new java.util.Date(t);
    }
    return d;
}