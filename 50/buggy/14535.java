private void addCallPairs() {
    (callPairs)++;
    if ((prevNode.size()) > 0)
        prevNode.peek().containsMethodCall();
    
}