private int getPointerY(com.android.phoneadapter.event.Motion motion) {
    if ((mFloatService.getResources().getConfiguration().orientation) == 2) {
        if ((motion.source) == 0) {
            return (mHeight) - (motion.x);
        }
        return motion.x;
    }
    return motion.y;
}