@java.lang.Override
public void onFailure(int errorCode) {
    if (errorCode == 204) {
        com.areatak.sabtshod.utils.Utility.showDialog(this, "error", no_transaction_found, false);
    }else
        if (errorCode == 400) {
            com.areatak.sabtshod.utils.Utility.showDialog(this, "error", token_invalid, false);
        }else {
            com.areatak.sabtshod.utils.Utility.showDialog(this, "error", connection_error, false);
        }
    
}