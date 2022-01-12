@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    deck.setName(input.getText().toString());
    org.dasfoo.delern.models.Deck.updateDeck(deck, new org.dasfoo.delern.listeners.AbstractOnFbOperationCompleteListener(org.dasfoo.delern.DelernMainActivityFragment.TAG, getContext()) {
        @java.lang.Override
        public void onOperationSuccess() {
        }
    });
}