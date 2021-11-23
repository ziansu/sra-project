private void startThreads() {
    new ServerSocketHandleThread(serverSocket, this, incomingQueue).start();
    new java.lang.Thread(new ClientSenderThread(eventQueue, socketsForBroadcast, receivedQueue, curTimeStamp, waitToResendQueue)).start();
    new IncomingMessageHandleThread(incomingQueue, receivedQueue, actionHoldingCount, socketsForBroadcast, curTimeStamp);
    new ReceivedThread(receivedQueue, displayQueue, curTimeStamp, socketsForBroadcast, localPlayers, actionHoldingCount);
    new DisplayThread(displayQueue, clientTable);
}