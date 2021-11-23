public void recieveMessage(java.lang.String username, java.lang.Object message, java.util.Calendar time) {
    java.lang.String timeStamp = new java.text.SimpleDateFormat("dd/MM HH:mm:ss").format(time.getTime());
    if (message instanceof javax.swing.ImageIcon)
        GUI.addMessage(username, ((javax.swing.ImageIcon) (message)), timeStamp);
    else
        if (message instanceof java.lang.String)
            GUI.addMessage(username, ((java.lang.String) (message)), timeStamp);
        else {
        }
    
}