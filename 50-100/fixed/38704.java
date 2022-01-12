protected void setRecv(java.lang.String topicName, int seq) {
    co.tinode.tinodesdk.model.Subscription<Pu, Pr> sub = mSubs.get(topicName);
    if ((sub != null) && ((sub.recv) < seq)) {
        sub.recv = seq;
        if ((mListener) != null) {
            mListener.onContactUpdate("recv", sub);
        }
    }
}