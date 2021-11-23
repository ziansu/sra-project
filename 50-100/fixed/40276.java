public void changeToolbarTitle() {
    if ((adapter) == null)
        return ;
    
    int total = adapter.getPickedImagePath().size();
    if ((getSupportActionBar()) != null) {
        if ((maxCount) == 1)
            getSupportActionBar().setTitle(titleActionBar);
        else
            getSupportActionBar().setTitle(((((((titleActionBar) + "(") + (java.lang.String.valueOf(total))) + "/") + (maxCount)) + ")"));
        
    }
}