public java.lang.String getSourceFormat() {
    synchronized(buffer) {
        return org.apache.sis.util.logging.MonolineFormatter.FORMAT_LABELS[sourceFormat];
    }
}