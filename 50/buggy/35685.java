@java.lang.Override
public void onClick(android.view.View v) {
    flingContainer.getTopCardListener().selectRight();
    firebaseCards.push().setValue(cardsList.get(0));
    cardsList.remove(0);
    cardsArrayAdapter.notifyDataSetChanged();
}