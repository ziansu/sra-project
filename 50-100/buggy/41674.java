@java.lang.Override
protected void initPreRecurseHook(com.intuso.housemate.api.object.HousemateObject<?, ?, ?, ?> parent) {
    if ((this) instanceof com.intuso.housemate.object.real.RealRoot)
        realRoot = ((com.intuso.housemate.object.real.RealRoot) (this));
    else
        if ((parent != null) && (parent instanceof com.intuso.housemate.object.real.RealObject))
            realRoot = ((com.intuso.housemate.object.real.RealObject) (parent)).realRoot;
        
    
}