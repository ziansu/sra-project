@java.lang.Override
public void onAnimationEnd(com.nineoldandroids.animation.Animator animation) {
    if (isOpened()) {
        viewActivity.setTouchDisable(true);
        viewActivity.setOnClickListener(viewActivityOnClickListener);
    }else {
        viewActivity.setTouchDisable(false);
        viewActivity.setOnClickListener(null);
        if ((menuListener) != null)
            menuListener.closeMenu();
        
    }
}