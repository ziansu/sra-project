public void setAddress(final org.apache.activemq.artemis.api.core.Message message, final org.apache.activemq.artemis.api.core.SimpleString address) {
    if ((defaultAddress) == null) {
        defaultAddress = address;
        if (message != null) {
            message.setAddress(address);
        }
    }else
        if (message != null) {
            if (!(address.equals(defaultAddress))) {
                message.setAddress(address);
            }else {
                message.setAddress(null);
            }
        }
    
}