@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View layout = inflater.inflate(R.layout.fragment_highscore, container, false);
    addButtonListeners(layout);
    android.widget.ListView highscoreList = ((android.widget.ListView) (layout.findViewById(R.id.highscore_list)));
    highscoreAdapter = new com.guesstheurf.guesstheurf.activities.adapters.HighscoreAdapter(getActivity(), R.layout.highscore_entry, Session.INSTANCE.getHighscores());
    highscoreList.setAdapter(highscoreAdapter);
    com.guesstheurf.guesstheurf.activities.fragments.HighscoreFragment.setListViewHeightBasedOnChildren(highscoreList);
    return layout;
}