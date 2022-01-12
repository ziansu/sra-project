public java.lang.Object setMessage(org.tuntuni.connection.Client client, java.lang.Object[] data) {
    if (client == null) {
        return new java.lang.Exception("The sender could not be recognized");
    }
    try {
        org.tuntuni.models.Message message = ((org.tuntuni.models.Message) (data[0]));
        message.setReceiver(true);
        message.setClient(client);
        message.setTime(new java.util.Date());
        client.addMessage(message);
    } catch (java.lang.Exception ex) {
        return ex;
    }
    return null;
}