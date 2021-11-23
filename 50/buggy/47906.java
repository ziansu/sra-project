@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    mTutorial = new com.cleveroad.slidingtutorial.TutorialImpl(mInternalFragment);
}