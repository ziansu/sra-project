private void sendFallbackMessage(java.lang.String channel, java.lang.String payload, java.lang.String sender) {
    if (org.apache.commons.lang.StringUtils.containsIgnoreCase(payload, "thank")) {
        sendMessage(channel, "You're welcome");
    }else
        if (org.apache.commons.lang.StringUtils.startsWithIgnoreCase(payload, "hello")) {
            sendMessage(channel, (("Hello " + sender) + "!"));
        }else
            if ((random.nextInt(3)) == 0) {
                sendMessage(channel, "Wut?");
            }else {
                sendMessage(channel, "I didn't understand the command");
            }
        
    
}