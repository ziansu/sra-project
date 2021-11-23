@java.lang.Override
public com.example.android.uamp.ui.tv.ViewHolder onCreateViewHolder(android.view.ViewGroup parent) {
    android.util.Log.d(com.example.android.uamp.ui.tv.CardPresenter.TAG, "onCreateViewHolder");
    com.example.android.uamp.ui.tv.CardPresenter.mContext = parent.getContext();
    android.support.v17.leanback.widget.ImageCardView cardView = new android.support.v17.leanback.widget.ImageCardView(com.example.android.uamp.ui.tv.CardPresenter.mContext);
    cardView.setFocusable(true);
    cardView.setFocusableInTouchMode(true);
    return new com.example.android.uamp.ui.tv.CardPresenter.CardViewHolder(cardView);
}