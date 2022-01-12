@java.lang.Override
public boolean pause(int... postStatus) {
    if ((getStatus()) != (XTaskBean.STATUS_DOING))
        return false;
    
    if (!(onPause()))
        return false;
    
    if ((postStatus.length) > 0) {
        setStatus(postStatus[0]);
    }else {
        setStatus(XTaskBean.STATUS_TODO);
    }
    if ((mListener) != null)
        mListener.onPause(getBean());
    
    return true;
}