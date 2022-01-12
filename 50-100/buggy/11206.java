public static com.app.PlayingCardSystem.GreenPlayerCardEnum getEnumInstance(java.lang.String enumName) {
    com.app.PlayingCardSystem.GreenPlayerCardEnum temp = null;
    for (com.app.PlayingCardSystem.GreenPlayerCardEnum gc : BoardGame.player_cards) {
        if (enumName.trim().equalsIgnoreCase(gc.name())) {
            temp = gc;
            break;
        }
        break;
    }
    return temp;
}