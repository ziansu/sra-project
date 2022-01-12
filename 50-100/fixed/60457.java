public boolean remove(@android.support.annotation.Nullable
com.gmail.collinsmith70.cvar.Cvar cvar) {
    if (cvar == null) {
        return false;
    }
    java.lang.String alias = cvar.getAlias();
    com.gmail.collinsmith70.cvar.Cvar queriedCvar = CVARS.get(alias);
    if (!(cvar.equals(queriedCvar))) {
        return false;
    }
    return (CVARS.remove(alias)) != null;
}