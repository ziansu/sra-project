public java.lang.String getNextAddress() {
    if (privateAdresses.isEmpty())
        return null;
    
    if ((privateAdresses.size()) == 1)
        return privateAdresses.get(0);
    
    return privateAdresses.get((((index)++) % (privateAdresses.size())));
}