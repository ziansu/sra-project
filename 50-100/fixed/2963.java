public void passInitialMessages() {
    if (receivedSoftInfo) {
        for (node.Vertex n : neighborList) {
            n.receiveMessage(new message.Message(this, softInfo));
        }
    }else {
        java.lang.System.out.println((("Houstons we have a situation. " + (nodeName)) + " not received soft info."));
    }
}