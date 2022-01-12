@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if (((curSnackbar) != null) && (curSnackbar.isShown()))
        curSnackbar.dismiss();
    
}