private void sendStreamMessageIfNeeded() {
    if (isStreamMgrReadyReceiveTuples()) {
        if ((getOutstandingPackets()) <= 0) {
            while (!(outStreamQueue.isEmpty())) {
                com.twitter.heron.proto.system.HeronTuples.HeronTupleSet tupleSet = outStreamQueue.poll();
                sendMessage(tupleSet);
            } 
        }
        if (!(outStreamQueue.isEmpty())) {
            startWriting();
        }
    }else {
        com.twitter.heron.network.StreamManagerClient.LOG.info("Stop writing due to not yet connected to Stream Manager.");
    }
}