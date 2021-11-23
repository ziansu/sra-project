private void add(final int position, @android.support.annotation.NonNull
final com.dexafree.materialList.card.Card card, final boolean scroll) {
    mCardList.add(position, card);
    card.getProvider().addObserver(this);
    mItemAnimation.onAddItem(position, scroll);
    notifyItemInserted(position);
}