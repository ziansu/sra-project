@java.lang.Override
public void send(Message msg) {
    try {
        XmlParser xmlParser = new XmlParser(myData);
        if ((serverUser) != null) {
            xmlParser.setUser(serverUser);
        }
        java.lang.String xml = xmlParser.MessageToXmlString(msg);
        streamOut = new java.io.DataOutputStream(new java.io.BufferedOutputStream(socket.getOutputStream()));
        streamOut.writeUTF(xml);
        streamOut.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}