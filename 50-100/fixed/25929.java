@java.lang.Override
public void onCardAdded(java.util.ArrayList<com.example.guest.pomodoro.models.Card> cards) {
    mCards = cards;
    com.example.guest.pomodoro.ui.CreateDeckDisplayFragment displayFrag = ((com.example.guest.pomodoro.ui.CreateDeckDisplayFragment) (getSupportFragmentManager().findFragmentById(R.id.fragmentDisplay)));
    if (displayFrag != null) {
        displayFrag.updateCardsList(mCards);
    }
}