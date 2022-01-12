private void splitAndForward(java.lang.String msg) {
    int delimiterIndex = 0;
    int i = 0;
    while ((i < (msg.length())) && (delimiterIndex == 0)) {
        if ((msg.charAt(i)) == ':')
            delimiterIndex = i;
        
        i++;
    } 
    int msgCode = java.lang.Integer.parseInt(msg.substring(0, delimiterIndex));
    java.lang.String argsString = msg.substring((delimiterIndex + 1));
    dispatch(msgCode, argsString);
}