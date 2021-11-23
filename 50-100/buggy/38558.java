@java.lang.Override
public void onItemClick(int position, android.view.View v) {
    onCardClickAction(v, position);
    if ((((mPrevView) != null) && ((mPrevView) != v)) && ((mRouteSession.getmOrderList().get(mPrevPosition).getCardStatus()) == (CARD_EXPANDED))) {
        onCardClickAction(mPrevView, mPrevPosition);
    }
    mPrevView = v;
    mPrevPosition = position;
}