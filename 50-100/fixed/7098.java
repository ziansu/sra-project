private void sendStateRequest(java.lang.Integer transactionId, java.util.Collection<java.lang.Integer> processes) {
    for (java.util.Iterator<java.lang.Integer> i = processes.iterator(); i.hasNext();) {
        send(new StateRequest(transactionId, this.id, i.next(), null));
    }
}