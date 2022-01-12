@java.lang.Override
public void onClick(android.view.View v) {
    popupWindow.dismiss();
    if (null != ((dynafios.trace.MainActivity) (getActivity()))) {
        ((dynafios.trace.MainActivity) (getActivity())).restoreActivity();
    }
}