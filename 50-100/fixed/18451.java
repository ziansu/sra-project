@java.lang.Override
public boolean abort() {
    synchronized(this) {
        if (((getStatus()) != (XTaskBean.STATUS_TODO)) && ((getStatus()) != (XTaskBean.STATUS_DOING)))
            return false;
        
        if (!(onAbort()))
            return false;
        
        setStatus(XTaskBean.STATUS_DONE);
    }
    if ((mListener) != null)
        mListener.onAbort(getBean());
    
    return true;
}