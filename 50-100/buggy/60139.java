public void reconcile(int sequenceNum) {
    java.lang.System.out.println(pendingInputs.size());
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