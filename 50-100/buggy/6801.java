public boolean endSuccess() {
    if ((getStatus()) != (XTaskBean.STATUS_DOING))
        return false;
    
    if (!(onEndSuccess()))
        return false;
    
    setStatus(XTaskBean.STATUS_DONE);
    if ((mListener) != null)
        mListener.onComplete(getBean());
    
    return true;
}