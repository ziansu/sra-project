public boolean addRecievedMessageType(GpsMessage type_class) {
    if (((message_tag) == null) || (message_tag.getMessageType().equals("")))
        return false;
    
    GoodMessages.put(message_tag, type_class);
    return true;
}