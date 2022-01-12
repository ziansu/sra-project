@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            showDialog(R.id.dialog_setup);
            break;
        case 1 :
            showDialog(R.id.dialog_gps_menu);
            break;
        case 2 :
            showDialog(R.id.dialog_toggles);
            break;
        case 3 :
            org.kflog.cumulus.CumulusActivity.nativeKeypress(((char) (30)));
            break;
    }
}