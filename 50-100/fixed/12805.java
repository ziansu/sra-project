@java.lang.Override
public boolean onTouchEvent(com.androlua.MotionEvent event) {
    if ((mOnTouchEvent) != null) {
        try {
            java.lang.Object ret = mOnTouchEvent.call(event);
            if ((ret != null) && ((ret.getClass()) == (boolean.class)))
                return true;
            
        } catch (com.androlua.LuaException e) {
            sendMsg(("onTouchEvent " + (e.getMessage())));
        }
    }
    return super.onTouchEvent(event);
}