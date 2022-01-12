protected message.Message clone() {
    try {
        return ((message.Message) (super.clone()));
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return null;
}