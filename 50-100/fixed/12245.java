private int getRealParametersCount(java.lang.reflect.Method m) {
    int c = 0;
    for (java.lang.Class<?> t : m.getParameterTypes()) {
        if ((((t != (fr.lteconsulting.pomexplorer.Client.class)) && (t != (fr.lteconsulting.pomexplorer.WorkingSession.class))) && (t != (fr.lteconsulting.pomexplorer.commands.CommandOptions.class))) && (t != (fr.lteconsulting.pomexplorer.ILogger.class)))
            c++;
        
    }
    return c;
}