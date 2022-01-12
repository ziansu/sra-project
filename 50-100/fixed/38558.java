@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    onCardClickAction(v, position, true);
    if ((((mPrevView) != null) && ((mPrevView) != v)) && ((mRouteSession.getmOrderList().get(mPrevPosition).getCardStatus()) == (CARD_EXPANDED))) {
        onCardClickAction(mPrevView, mPrevPosition, false);
    }
    mPrevView = v;
    mPrevPosition = position;
}