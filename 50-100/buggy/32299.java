protected void receiveMessage(java.lang.String user, java.lang.String newMessage, int verifier) {
    java.lang.System.out.println(("Received : " + newMessage));
    if (verifier == (me.shaaheen.shawtyandshady.MainActivity.counter)) {
        me.shaaheen.shawtyandshady.MainActivity.messageDisplay.setText((((((me.shaaheen.shawtyandshady.MainActivity.messageDisplay.getText().toString()) + user) + " > ") + newMessage) + "\r\n"));
    }
}