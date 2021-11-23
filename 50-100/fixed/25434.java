public co.marcin.novaguilds.enums.ChatMode next() {
    boolean n = false;
    for (co.marcin.novaguilds.enums.ChatMode mode : co.marcin.novaguilds.enums.ChatMode.values()) {
        if (!(mode.isEnabled())) {
            continue;
        }
        if (n) {
            return mode;
        }
        n = n || (mode == (this));
    }
    return co.marcin.novaguilds.enums.ChatMode.NORMAL;
}