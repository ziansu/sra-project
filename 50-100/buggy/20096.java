public void requestStart(User user, java.util.ArrayList<?> data) {
    boolean hasRequestedStart = ((boolean) (data.get(0)));
    java.lang.String msg = ((java.lang.String) (data.get(1)));
    Game game = user.getGame();
    game.requestStart(user, hasRequestedStart, msg);
}