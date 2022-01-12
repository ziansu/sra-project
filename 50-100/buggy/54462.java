private void splitAndForward(java.lang.String msg) {
    int delimiterIndex = 0;
    for (int i = 0; i < (msg.length()); i++) {
        if ((msg.charAt(i)) == ':')
            delimiterIndex = i;
        
    }
    int msgCode = java.lang.Integer.parseInt(msg.substring(0, delimiterIndex));
    java.lang.String argsString = msg.substring((delimiterIndex + 1));
    dispatch(msgCode, argsString);
}