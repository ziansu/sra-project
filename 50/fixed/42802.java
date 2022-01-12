public boolean addRecievedMessageType(GpsMessage type_class) {
    if ((type_class == null) || (type_class.getMessageType().equals("")))
        return false;
    
    GoodMessages.put(type_class.getMessageType(), type_class);
    return true;
}