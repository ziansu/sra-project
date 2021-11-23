@java.lang.Override
public void onResume() {
    super.onResume();
    mPriceSetting = java.lang.Integer.parseInt(getFamiliarActivity().mPreferenceAdapter.getDeckPrice());
    mShowTotalDecklistPrice = getFamiliarActivity().mPreferenceAdapter.getShowTotalDecklistPrice();
    mCompressedDecklist.clear();
    readAndCompressDecklist(null, mCurrentDeck);
    mListAdapter.notifyDataSetChanged();
    mDeckCards.setText(getResources().getQuantityString(R.plurals.decklist_cards_count, ((com.gelakinetic.mtgfam.fragments.DecklistFragment.CardDataAdapter) (mListAdapter)).getTotalCards(), ((com.gelakinetic.mtgfam.fragments.DecklistFragment.CardDataAdapter) (mListAdapter)).getTotalCards()));
}