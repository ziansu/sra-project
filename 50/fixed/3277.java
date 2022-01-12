private java.util.List<model.Player> getYouthFirstEleven() {
    int size = getYouthPlayers().size();
    if (size > 11) {
        return getYouthPlayers().subList(0, 11);
    }else {
        return getYouthPlayers();
    }
}