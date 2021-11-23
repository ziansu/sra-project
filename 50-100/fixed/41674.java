@java.lang.Override
protected void initPreRecurseHook(com.intuso.housemate.api.object.HousemateObject<?, ?, ?, ?> parent) {
    if (((com.intuso.housemate.object.real.RealObject) (this)) instanceof com.intuso.housemate.object.real.RealRoot)
        realRoot = ((com.intuso.housemate.object.real.RealRoot) ((com.intuso.housemate.object.real.RealObject) (this)));
    else
        if ((parent != null) && (parent instanceof com.intuso.housemate.object.real.RealObject))
            realRoot = ((com.intuso.housemate.object.real.RealObject) (parent)).realRoot;
        
    
}