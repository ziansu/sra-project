public void handleHint() {
    java.util.ArrayList<main.java.group37.bejeweled.board.Tile> hint = main.java.group37.bejeweled.model.GameLogic.getHint();
    if (!(hint.isEmpty())) {
        panel.main.setFocusHint(hint.get(0).getLoc(), hint.get(1).getLoc());
    }
}