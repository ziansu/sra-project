protected void receiveMessage(java.lang.String user, java.lang.String newMessage) {
    java.lang.System.out.println(("Received : " + newMessage));
    me.shaaheen.shawtyandshady.MainActivity.messageDisplay.setText((((((me.shaaheen.shawtyandshady.MainActivity.messageDisplay.getText().toString()) + user) + " > ") + newMessage) + "\r\n"));
}