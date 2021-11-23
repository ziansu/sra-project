public final boolean hasReceiveMore() {
    return ((int) (getOption(ZMQ.ZMQ_RCVMORE))) == 1;
}