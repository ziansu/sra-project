public void saveMessages(java.util.ArrayList<clientCore.MessagesDate> mList) throws java.io.FileNotFoundException, java.io.IOException, javax.mail.MessagingException {
    java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream("messages.ser"));
    for (int i = 0; i < (mList.size()); i++) {
        out.writeObject(mList);
    }
    out.flush();
    out.close();
}