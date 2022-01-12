public void setPrefixes(final java.lang.String... prefixes) {
    if ((prefixes != null) && (0 < (prefixes.length)))
        format.getHeader().createEntry(org.redline_rpm.PREFIXES, prefixes);
    
}