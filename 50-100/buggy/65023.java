private void sendStreamMessageIfNeeded() {
    if (isStreamMgrReadyReceiveTuples()) {
        if ((getOutstandingPackets()) <= 0) {
            if (!(outStreamQueue.isEmpty())) {
                com.twitter.heron.proto.system.HeronTuples.HeronTupleSet tupleSet = outStreamQueue.poll();
                for (int i = 0; i < 20; i++) {
                    sendMessage(tupleSet);
                }
            }
        }
        if (!(outStreamQueue.isEmpty())) {
            startWriting();
        }
    }else {
        com.twitter.heron.network.StreamManagerClient.LOG.info("Stop writing due to not yet connected to Stream Manager.");
    }
}