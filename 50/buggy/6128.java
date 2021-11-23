public void passInitialMessages() {
    double[] identityMessage = new double[]{ 1 , 1 , 1 , 1 };
    for (node.Vertex n : neighborList) {
        n.receiveMessage(new message.Message(this, identityMessage));
    }
}