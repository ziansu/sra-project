public void saveState(android.os.Bundle savedState) {
    java.util.ArrayList<java.lang.Integer> data = new java.util.ArrayList<>();
    data.add(getColumns());
    data.add(getRows());
    saveLayoutData(data);
    savedState.putIntegerArrayList(com.github.ssnikolaevich.flipgame.game.Game.STATE_DATA, data);
}