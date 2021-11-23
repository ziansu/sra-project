public final boolean hasReceiveMore() {
    if (((java.lang.Integer) (getOption(ZMQ.ZMQ_RCVMORE))) == 1)
        return true;
    else
        return false;
    
}