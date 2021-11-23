public boolean endError(java.lang.String errorCode, boolean retry) {
    synchronized(this) {
        if ((getStatus()) != (XTaskBean.STATUS_DOING))
            return false;
        
        if (!(onEndError(errorCode, retry)))
            return false;
        
        setStatus(XTaskBean.STATUS_ERROR);
    }
    if ((mListener) != null)
        mListener.onError(getBean(), errorCode, retry);
    
    return true;
}