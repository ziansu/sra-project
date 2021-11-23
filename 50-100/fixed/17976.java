private void ensureLib() {
    ensureArgsParsed();
    if (argsParsed.hasOption(org.kyupi.apps.App.OPT_LIB)) {
        java.lang.String val = argsParsed.getOptionValue(org.kyupi.apps.App.OPT_LIB).toUpperCase();
        if (val.startsWith("N"))
            lib = new org.kyupi.graph.LibraryNangate();
        else
            if (val.startsWith("S"))
                lib = new org.kyupi.graph.LibrarySAED();
            else
                lib = new org.kyupi.graph.Library();
            
        
    }else {
        if ((lib) == null)
            lib = new org.kyupi.graph.Library();
        
    }
}