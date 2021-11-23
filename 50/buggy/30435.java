@java.lang.Override
public void onComplete() {
    progressView.setVisibility(View.INVISIBLE);
    com.rey.material.app.Dialog alert = new com.rey.material.app.Dialog(fragMap.getActivity());
    alert.cancelable(true).contentView(al).show();
}