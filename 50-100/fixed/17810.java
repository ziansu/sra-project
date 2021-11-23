private void setUpLayoutFactories(boolean cloned) {
    if (cloned)
        return ;
    
    if (((getFactory2()) != null) && (!((getFactory2()) instanceof cn.nekocode.emojix.EmojixLayoutInflater.WrapperFactory2))) {
        setFactory2(getFactory2());
    }
    if (((getFactory()) != null) && (!((getFactory()) instanceof cn.nekocode.emojix.EmojixLayoutInflater.WrapperFactory))) {
        setFactory(getFactory());
    }
}