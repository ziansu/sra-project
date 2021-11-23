public void setAddress(final org.apache.activemq.artemis.api.core.Message message, final org.apache.activemq.artemis.api.core.SimpleString address) {
    if ((defaultAddress) == null) {
        defaultAddress = address;
        message.setAddress(address);
    }else {
        if (!(address.equals(defaultAddress))) {
            message.setAddress(address);
        }else {
            message.setAddress(null);
        }
    }
}