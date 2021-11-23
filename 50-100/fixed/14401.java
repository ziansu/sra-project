private void parseYour(java.lang.String message) {
    getM_cards().clear();
    int beginIndex = 5;
    if ((message.length()) <= 5) {
        return ;
    }
    message = message.substring(beginIndex);
    java.lang.String delim = ",";
    java.lang.String[] data = message.split(delim);
    for (java.lang.String s : data) {
        durakVisualClient.Card c = durakVisualClient.Card.fromString(s);
        getM_cards().add(c);
    }
}