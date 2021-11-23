@java.lang.Override
public void onChanged() {
    super.onChanged();
    int childCount = getChildCount();
    if (childCount < (com.daprlabs.cardstack.SwipeDeck.NUMBER_OF_CARDS)) {
        for (int i = childCount; i < (com.daprlabs.cardstack.SwipeDeck.NUMBER_OF_CARDS); ++i) {
            addNextCard();
        }
        for (int i = 0; i < (getChildCount()); ++i) {
            positionItem(i);
        }
    }
}