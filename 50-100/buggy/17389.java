@java.lang.Override
public void onEvent(int type, com.jjjackson.konchinka.handler.BaseTween<?> source) {
    if (type != (COMPLETE))
        return ;
    
    combinedCards.remove(card);
    model.turnCombinedCards.add(card);
    removeListeners(java.util.Collections.singletonList(card));
    model.buttons.sortButton.setVisible(true);
    centerTableCards();
    enableEndButtons();
}