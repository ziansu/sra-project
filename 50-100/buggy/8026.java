void disconnected(int number) {
    clientHandlers[number] = null;
    (connections)--;
    send(new Message(Message.TYPE_DISCONNECT, number, ((users[(number + 1)]) + " disconnected"), users[(number + 1)]));
    waitForConnection(number);
}