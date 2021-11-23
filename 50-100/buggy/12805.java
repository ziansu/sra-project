@java.lang.Override
public boolean onTouchEvent(com.androlua.MotionEvent event) {
    if ((mOnTouchEvent) != null) {
        try {
            java.lang.Object ret = mOnTouchEvent.call(event);
            if (((ret != null) && ((ret.getClass()) == (java.lang.Boolean.class))) && ((boolean) (ret)))
                return true;
            
        } catch (com.androlua.LuaException e) {
            sendMsg(("onTouchEvent " + (e.getMessage())));
        }
    }
    return super.onTouchEvent(event);
}