@java.lang.Override
public void invalidateChildRegion(com.chenjishi.slidedemo.base.SlidingLayout parent, com.chenjishi.slidedemo.base.View child) {
    if (((mGetDisplayList) != null) && ((mRecreateDisplayList) != null)) {
        try {
            mRecreateDisplayList.setBoolean(child, true);
            mGetDisplayList.invoke(child, ((java.lang.Object[]) (null)));
        } catch (java.lang.Exception e) {
            android.util.Log.e(com.chenjishi.slidedemo.base.SlidingLayout.TAG, "Error refreshing display list state", e);
        }
    }else {
        child.invalidate();
        return ;
    }
    super.invalidateChildRegion(parent, child);
}