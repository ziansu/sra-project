void disconnected(int number) {
    clientHandlers[number] = null;
    (connections)--;
    if ((users[(number + 1)]) != null)
        send(new Message(Message.TYPE_DISCONNECT, number, ((users[(number + 1)]) + " disconnected"), users[(number + 1)]));
    
    users[(number + 1)] = null;
    waitForConnection(number);
}