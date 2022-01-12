public java.util.logging.Logger getLogger() {
    if ((getPlugin()) != null)
        return getPlugin().getLogger();
    
    return null;
}