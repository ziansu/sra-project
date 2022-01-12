@java.lang.Override
public void onTaskAborted(java.lang.Throwable th) {
    fProgressBar.setVisibility(View.GONE);
    new li.itcc.hackathon15.util.ExceptionHandler(getActivity()).onTaskAborted(th);
}