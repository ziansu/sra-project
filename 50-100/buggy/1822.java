private void parseYour(java.lang.String message) {
    getM_cards().clear();
    int beginIndex = 5;
    message = message.substring(beginIndex);
    java.lang.String delim = ",";
    java.lang.String[] data = message.split(delim);
    for (java.lang.String s : data)
        getM_cards().add(durakVisualClient.Card.fromString(s));
    
}