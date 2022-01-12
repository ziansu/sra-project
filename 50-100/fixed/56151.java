@java.lang.Override
public void onDrawerSlide(android.view.View drawerView, float slideOffset) {
    if (slidingDrawerEffect)
        super.onDrawerSlide(drawerView, slideOffset);
    else
        super.onDrawerSlide(drawerView, 0.0F);
    
    if ((drawerListener) != null)
        drawerListener.onDrawerSlide(drawerView, slideOffset);
    
}