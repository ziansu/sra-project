@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    final org.dasfoo.delern.models.Deck newDeck = new org.dasfoo.delern.models.Deck(input.getText().toString(), DeckType.BASIC.name(), true);
    org.dasfoo.delern.models.Deck.createNewDeck(newDeck, new org.dasfoo.delern.listeners.AbstractOnFbOperationCompleteListener(org.dasfoo.delern.DelernMainActivityFragment.TAG, getContext()) {
        @java.lang.Override
        public void onOperationSuccess() {
            startEditCardsActivity(getAddedKey(), newDeck.getName());
            mEmptyMessageTextView.setVisibility(TextView.INVISIBLE);
        }
    });
}