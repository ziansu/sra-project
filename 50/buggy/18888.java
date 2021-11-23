public void add(java.lang.String appkey, uk.ac.mdx.cs.ie.acontextlib.IContextReceiver receiver) {
    mReceiverMap.put(appkey, receiver);
    mReceivers = ((uk.ac.mdx.cs.ie.acontextlib.ContextReceiver[]) (mReceiverMap.values().toArray()));
}