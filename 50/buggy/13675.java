@java.lang.Override
public void onTaskCompleted(edu.jhu.tutorsanonymous.api.resources.Req result) {
    startSession.setVisibility(View.INVISIBLE);
    startSession.setEnabled(false);
    ready.setVisibility(View.VISIBLE);
}