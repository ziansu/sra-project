@java.lang.Override
public void onError(android.content.Context context, java.lang.Exception e) {
    progress.setVisibility(View.GONE);
    mLogcatSummary.setText(errorText);
    mLogcatSummary.setTextColor(android.support.v4.content.ContextCompat.getColor(getActivity(), errorTextColor));
    e.printStackTrace();
}