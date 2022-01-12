public void reconcile(int sequenceNum) {
    synchronized(pendingInputs) {
        java.util.Iterator<proto.GameStateExchangeProto.GameStateExchange.InputState> it = pendingInputs.listIterator();
        while (it.hasNext()) {
            proto.GameStateExchangeProto.GameStateExchange.InputState update = it.next();
            if ((update.getSequenceNum()) > sequenceNum) {
                applyInput(update);
            }else {
                it.remove();
            }
        } 
    }
}