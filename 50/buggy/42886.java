@java.lang.Override
public void onError(org.gem.indo.dooit.api.DooitAPIError error) {
    for (java.lang.String msg : error.getErrorMessages())
        showSnackbar(msg);
    
    dismissDialog();
}