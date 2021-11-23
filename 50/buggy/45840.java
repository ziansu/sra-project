protected message.Message clone() {
    message.Message message = null;
    try {
        message = ((message.Message) (super.clone()));
        message.isDuplicate = true;
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return message;
}