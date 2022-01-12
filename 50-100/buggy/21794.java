public edu.purdue.cs490.Message receive(edu.purdue.cs490.Message pre) {
    edu.purdue.cs490.Message m = beblayer.receive(pre);
    if (m == null)
        return null;
    
    if (m != null)
        receivedMessage.add(m);
    
    if ((((edu.purdue.cs490.ChatClientMessage) (m)).getType()) == 1) {
        m.setType(((m.getType()) - 1));
        beblayer.receive(m);
        return null;
    }
    return m;
}