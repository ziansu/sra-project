private void submitAnswer(java.util.UUID answerID) {
    setBuzzerTime();
    if ((buzzerTime) <= (allowedTime))
        try {
            service.sendMessage(new TrivaGameClient.BasicUserMessage(1, playerID, groupIp));
        } catch (java.net.UnknownHostException e) {
            e.printStackTrace();
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
        }
    
    chosenAnswerId = answerID;
}