@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if ((!(curSnackbar.equals(null))) && (curSnackbar.isShown()))
        curSnackbar.dismiss();
    
}