@java.lang.Override
public void onEventMainThread(com.edisonwang.ps.sample.ComplicatedAction.SampleActionSuccessEvent event) {
    onReceived((((((event.getClass().getSimpleName()) + " that was ") + (event.mSampleParam)) + " ") + (event.mSampleParcelable.mTestName)));
}