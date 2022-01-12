public synchronized pt.ulisboa.tecnico.hourglass.common.communication.messages.ComputationalMessage<I, M> addMessage(M message, I targetID) {
    if (!(messages.containsKey(targetID))) {
        messages.put(targetID, new java.util.ArrayList<M>(bufferSize));
    }
    messages.get(targetID).add(message);
    if ((++(this.index)) == (bufferSize)) {
        return toComputationalMessage(false);
    }else {
        return null;
    }
}