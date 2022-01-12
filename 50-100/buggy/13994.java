public java.lang.String getNextAddress() {
    if ((privateAdresses.size()) > 0) {
        if ((privateAdresses.size()) > 1)
            index = ((index) + 1) % (privateAdresses.size());
        
        return privateAdresses.get(index);
    }else {
        return null;
    }
}