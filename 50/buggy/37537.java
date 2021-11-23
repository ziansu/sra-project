@java.lang.Override
public void run() {
    loadBook();
    if ((pgDailog != null) && (pgDailog.isShowing()))
        pgDailog.dismiss();
    
}