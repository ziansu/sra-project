public void ForwardMessage(java.lang.Object content, client.Group recievers) {
    for (client.User U : recievers)
        sendMessage(content, U.getIP());
    
}