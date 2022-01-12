public uk.ac.mdx.cs.ie.acontextlib.IContextReceiver remove(java.lang.String appkey) {
    uk.ac.mdx.cs.ie.acontextlib.IContextReceiver result = mReceiverMap.remove(appkey);
    mReceivers = mReceiverMap.values();
    return result;
}