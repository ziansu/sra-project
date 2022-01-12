boolean setStatusBarColor(int color) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT))
        return false;
    
    return true;
}