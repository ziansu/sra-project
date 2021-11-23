@java.lang.Override
protected void setUp() {
    solo = new com.robotium.solo.Solo(getInstrumentation(), getActivity());
    pianoActivity = getActivity();
}