boolean isAppActive(org.luwrain.core.Application app) {
    org.luwrain.core.NullCheck.notNull(app, "app");
    if ((app == (defaultApp)) && ((activeAppIndex) < 0))
        return true;
    
    if ((activeAppIndex) < 0)
        return false;
    
    if ((apps.get(activeAppIndex).app) == app)
        return true;
    
    return false;
}