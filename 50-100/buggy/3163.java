@java.lang.Override
public void execute() {
    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
    com.example.webprog26.guitarchords.fragments.PlayShapeFragment playShapeFragment = ((com.example.webprog26.guitarchords.fragments.PlayShapeFragment) (fragmentManager.findFragmentByTag(com.example.webprog26.guitarchords.guitar_chords_engine.commands.LoadShapeFragmentCommand.PLAY_FRAGMENT_TAG)));
    if (playShapeFragment == null) {
        fragmentManager.beginTransaction().add(R.id.play_chord_activity_content, com.example.webprog26.guitarchords.fragments.PlayShapeFragment.newInstance(getPlayableShapePosition())).commit();
    }
}