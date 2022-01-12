private boolean isFiltered(java.lang.String name) {
    java.lang.String[] patterns = conf.getProperty("mailbox.ignored.folders").split(",");
    for (java.lang.String pattern : patterns) {
        if (name.equals(pattern.trim()))
            return true;
        
    }
    return false;
}