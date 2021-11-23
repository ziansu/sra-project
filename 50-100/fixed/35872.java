private void GoToGameSummary() {
    com.example.stacjonarny.graulamki.fragments.GameSummary summary_fragment = new com.example.stacjonarny.graulamki.fragments.GameSummary();
    android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, summary_fragment);
    transaction.commit();
    com.example.stacjonarny.graulamki.fragments.Game.END_GAME_SOUND.start();
}