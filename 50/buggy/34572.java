@java.lang.Override
protected void setUp() {
    solo = new com.robotium.solo.Solo(getInstrumentation(), getActivity());
    solo.waitForActivity(org.catrobat.musicdroid.pocketmusic.instrument.piano.PianoActivity.class);
    pianoActivity = getActivity();
}