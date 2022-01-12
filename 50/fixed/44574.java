public java.lang.String readString() {
    if (isActive()) {
        return client.readStringUntil(BlackJackDemo.EOL).trim();
    }
    return null;
}