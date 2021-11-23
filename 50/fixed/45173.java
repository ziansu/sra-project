@java.lang.Override
public void onError() {
    mProgress.setVisibility(View.GONE);
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), getFlexString(R.string.IMG_OPEN_ERROR), Toast.LENGTH_SHORT).show();
    }
}