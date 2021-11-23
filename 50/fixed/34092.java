@java.lang.Override
public void onEventMainThread(com.edisonwang.ps.sample.SampleChainedActionEvent event) {
    onReceived((((event.getClass().getSimpleName()) + " that was ") + (event.sampleParam3)));
}