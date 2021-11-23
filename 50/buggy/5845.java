public void setPrefixes(final java.lang.String... prefixes) {
    if (prefixes != null)
        format.getHeader().createEntry(org.redline_rpm.PREFIXES, prefixes);
    
}