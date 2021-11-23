private int getInt(com.github.theholywaffle.lolchatapi.LolStatus.XMLProperty p) {
    final java.lang.String value = get(p);
    if (value.isEmpty()) {
        return -1;
    }
    return java.lang.Integer.parseInt(value);
}