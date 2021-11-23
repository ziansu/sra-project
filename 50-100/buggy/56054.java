@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case 0 :
            if (!(checkPermission())) {
                getLastLocation();
            }else {
                requestPermissions();
            }
        case 1 :
            dialog.cancel();
            manual_input.create();
    }
}