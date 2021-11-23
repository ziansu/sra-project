@java.lang.Override
public void onEvent(int type, com.jjjackson.konchinka.handler.BaseTween<?> source) {
    ((com.jjjackson.konchinka.handler.User) (model.currentPlayer)).boardCards.addAll(model.table.playCards);
    model.table.playCards.clear();
    setNextState();
}