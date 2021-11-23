@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    com.app.deemounus.musiccards.MainActivity mainActivity = ((com.app.deemounus.musiccards.MainActivity) (getActivity()));
    ismTwoPane = mainActivity.ismTwoPane();
}